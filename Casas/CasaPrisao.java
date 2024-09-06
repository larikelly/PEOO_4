package Casas;

import Players.Jogador;
import Utils.Tabuleiro;

import java.util.Scanner;

public class CasaPrisao extends Casa {

    public CasaPrisao(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        System.out.println("CASA PRISÃO: Você ficará preso e não jogará na próxima rodada.");
        jogador.setPulaProximaRodada(true);
    }
}

