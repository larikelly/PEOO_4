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

    public static Tabuleiro getInstancia() {
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
            casas.add(CasaFactory.criarCasa(i)); 
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

    public Jogador JogadorMaisAtras() {
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
