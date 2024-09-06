package Casas;

import Players.*;
import Utils.*;
import java.util.ArrayList;
import java.util.Scanner;

public class CasaSurpresa extends Casa {

    private static ArrayList<Jogador> listaDeJogadores = new ArrayList<>();

    public CasaSurpresa(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        System.out.println("CASA SURPRESA! Uma carta será tirada.");
        String novoTipo = Cartas.tirarCarta(); 
        System.out.println("A nova carta indica que você deve se tornar um jogador do tipo: " + novoTipo);
        atualizarTipoJogador(jogador, novoTipo);
    }

    public static void atualizarTipoJogador(Jogador jogador, String novoTipo) {
        int index = listaDeJogadores.indexOf(jogador);
        if (index != -1) {
            Jogador jogadorAtualizado;
            int position = jogador.getPosição();
            String cor = jogador.getCor();

            switch (novoTipo) {
                case "Azarado":
                    jogadorAtualizado = new JogadorAzarado(position, cor);
                    break;
                case "Sortudo":
                    jogadorAtualizado = new JogadorSortudo(position, cor);
                    break;
                case "Normal":
                default:
                    jogadorAtualizado = new JogadorNormal(position, cor);
                    break;
            }
            listaDeJogadores.set(index, jogadorAtualizado);
        } else {
            System.out.println("Jogador não encontrado na lista.");
        }
    }

    public static void adicionarJogador(Jogador jogador) {
        listaDeJogadores.add(jogador);
    }

    public static void removerJogador(Jogador jogador) {
        listaDeJogadores.remove(jogador);
    }
}
