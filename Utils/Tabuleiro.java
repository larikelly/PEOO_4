package Utils;

import java.util.ArrayList;
import java.util.List;
import Players.Jogador;
import Casas.*;

public class Tabuleiro {
    private static Tabuleiro instanciaUnica;
    private List<Casa> casas;
    private List<Jogador> jogadores;
    private final int tamanho = 40; 

    private Tabuleiro() {
        casas = new ArrayList<>();
        jogadores = new ArrayList<>();
        inicializarCasas(); 
    }

    public static synchronized Tabuleiro getInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new Tabuleiro();
        }
        return instanciaUnica;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void atualizarJogador(Jogador jogadorDecorado) {
        for (int i = 0; i < jogadores.size(); i++) {
            if (jogadores.get(i).getCor().equals(jogadorDecorado.getCor())) {
                jogadores.set(i, jogadorDecorado);  
                break;
            }
        }
    }

    private void inicializarCasas() {
        for (int i = 0; i < 40; i++) {
            if (i == 10 || i == 25 || i == 38) {
                casas.add(new CasaPrisao(i)); 
            } else if (i == 13) {
                casas.add(new CasaSurpresa(i)); 
            } else if (i == 5 || i == 15 || i == 30) {
                casas.add(new CasaSorte(i)); 
            } else if (i == 17 || i == 27) {
                casas.add(new CasaTroca(i)); 
            } else if (i == 20 || i == 35) {
                casas.add(new CasaReversa(i)); 
            } else if (i == 7 || i == 22 || i == 36) {
                casas.add(new CasaAzar(i)); 
            } else if (i == 2 || i == 12 || i == 32) {
                casas.add(new CasaJogaDeNovo(i)); 
            } else {         
                casas.add(new CasaSimples(i)); 
            }
        }
    }

    public Casa getCasa(int posicao) {
        if (posicao >= 0 && posicao < casas.size()) {
            return casas.get(posicao);
        } else {
            return null;
        }
    }

    public int getTamanho() {
        return tamanho;
    }

    public void imprimirTabuleiro() {
        System.out.println("Tabuleiro:");
        for (int i = 0; i < 40; i++) {
            boolean jogadorNaCasa = false;
            String jogadoresNaCasa = "";

            for (Jogador jogador : jogadores) {
                if (jogador.getPosição() == i) {
                    jogadorNaCasa = true;
                    jogadoresNaCasa += jogador.getCor().substring(0, 1).toUpperCase();
                }
            }

            if (jogadorNaCasa) {
                System.out.print("[" + jogadoresNaCasa + "] ");
            } else {
                System.out.print("[ ] ");
            }

            if ((i + 1) % 10 == 0) {
                System.out.println();
            }
        }
    }

    public Jogador getJogadorMaisAtras() {
        if (jogadores.isEmpty()) {
            return null;
        }

        Jogador jogadorMaisAtras = jogadores.get(0);

        for (Jogador jogador : jogadores) {
            if (jogador.getPosição() < jogadorMaisAtras.getPosição()) {
                jogadorMaisAtras = jogador;
            }
        }

        return jogadorMaisAtras;
    }
}
