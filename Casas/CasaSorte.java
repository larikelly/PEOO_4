package Casas;

import java.util.Scanner;

import Players.Jogador;
import Players.JogadorAzarado;
import Utils.Tabuleiro;

    public class CasaSorte extends Casa {

    public CasaSorte(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        if (!(jogador instanceof JogadorAzarado)) {
            System.out.println("CASA SORTE: Avance 3 casas.");
            jogador.setPosição(jogador.getPosição() + 3);
        } else {
            System.out.println("CASA SORTE: Mas como você é azarado, não pode avançar.");
        }
    }
}

