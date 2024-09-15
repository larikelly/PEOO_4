package Casas;

import Players.Jogador;
import java.util.Scanner;
import Utils.Tabuleiro;

public class CasaReversa extends Casa {

    public CasaReversa(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        Jogador jogadorMaisAtras = tabuleiro.JogadorMaisAtras();
        if (jogadorMaisAtras != null && jogadorMaisAtras != jogador) {
            System.out.println("CASA REVERSA: Você troca de posição com o jogador mais atrás.");
            int temp = jogador.getPosição();
            jogador.setPosição(jogadorMaisAtras.getPosição());
            jogadorMaisAtras.setPosição(temp);
        } else {
            System.out.println("CASA REVERSA: Você é o último jogador, então não há ninguém para trocar.");
        }
    }
}

