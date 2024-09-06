package Utils;

import Players.*;
import Casas.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private Tabuleiro tabuleiro;
    private GerenciadorCores gerenciadorCores;
    private List<Jogador> listaDeJogadores;

    public Jogo() {
        this.tabuleiro = Tabuleiro.getInstancia();
        this.gerenciadorCores = new GerenciadorCores();
        this.listaDeJogadores = new ArrayList<>();
    }

    public void configurarJogo() {
        Scanner input = new Scanner(System.in);
        List<String> coresDisponiveis = gerenciadorCores.getCoresDisponiveis();
        List<String> coresEscolhidas = new ArrayList<>();
        int numJogadores;

        while (true) {
            System.out.println("Quantos jogadores vão participar? (Mínimo: 2 / Máximo: 6)");
            numJogadores = input.nextInt();
            input.nextLine();  

            if (numJogadores >= 2 && numJogadores <= 6) {
                break;
            } else {
                System.out.println("Número de jogadores deve ser entre 2 e 6.");
            }
        }

        String[] tipos = {"Azarado", "Sortudo", "Normal"};
        Random random = new Random();

        for (int i = 0; i < numJogadores; i++) {
            String cor = gerenciadorCores.escolherCor(input, coresDisponiveis, coresEscolhidas);

            Jogador jogador;
            String tipoDeJogador = tipos[random.nextInt(tipos.length)];

            switch (tipoDeJogador) {
                case "Azarado":
                    jogador = new JogadorAzarado(0, cor);
                    break;
                case "Sortudo":
                    jogador = new JogadorSortudo(0, cor);
                    break;
                case "Normal":
                default:
                    jogador = new JogadorNormal(0, cor);
                    break;
            }

            listaDeJogadores.add(jogador);
            tabuleiro.adicionarJogador(jogador);
        }
    }

    public void printTabuleiro() {
        tabuleiro.imprimirTabuleiro();
    }

    public void start() {
        Scanner input = new Scanner(System.in);
        boolean jogoFinalizado = false;
        String vencedorCor = null;

        while (!jogoFinalizado) {
            for (Jogador jogador : listaDeJogadores) {
                if (jogador.isPulaProximaRodada()) {
                    jogador.setPulaProximaRodada(false);
                    System.out.println("Jogador " + jogador.getCor() + " está pulando esta rodada.");
                    continue;
                }

                System.out.println("\nRodada do jogador: " + jogador.getCor());
                System.out.println("Posição atual: " + jogador.getPosição());
                System.out.println("Aperte Enter para jogar os dados ou digite um número de casa para modo Debug...");
                
                String inputLinha = input.nextLine();
                if (inputLinha.isEmpty()) {
                    int resultadoDados = Dados.rolarDoisDados(jogador);
                    jogador.setPosição(jogador.getPosição() + resultadoDados);
                    System.out.println("O jogador " + jogador.getCor() + " obteve no total: " + resultadoDados);
                } else {
                    try {
                        int novaPosicao = Integer.parseInt(inputLinha);
                        jogador.setPosição(novaPosicao);
                        System.out.println("MODO DEBUG: Jogador " + jogador.getCor() + " movido para a casa " + novaPosicao);
                    } catch (NumberFormatException e) {
                        System.out.println("Entrada inválida para o modo Debug.");
                        continue;
                    }
                }
                jogador.incrementarRodadas();

                Casa casaAtual = tabuleiro.getCasa(jogador.getPosição());
                if (casaAtual != null) {
                    casaAtual.aplicarRegra(jogador, tabuleiro, input);
                }

                if (jogador.getPosição() >= tabuleiro.getTamanho() - 1) {
                    vencedorCor = jogador.getCor();
                    jogoFinalizado = true;
                    break;
                }

                printTabuleiro(); 
            }
        }

        exibirResultados(vencedorCor);
    }

    private void exibirResultados(String vencedorCor) {
        System.out.println("Jogador Vencedor: " + vencedorCor);
        System.out.print("-----------------------------\n");

        for (Jogador jogador : listaDeJogadores) {
            System.out.println("Jogador " + jogador.getCor() +
                "\nPosição: " + jogador.getPosição() +
                "\nQuantidade de Jogadas: " + jogador.getRodadas());
        }
    }
}
