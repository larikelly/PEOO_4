package Casas;

import Utils.Tabuleiro;
import java.util.Scanner;

import Players.Jogador;
    public class CasaJogaDeNovo extends Casa {

    public CasaJogaDeNovo(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        System.out.println("CASA JOGA DE NOVO: Você jogará os dados novamente.");
        jogador.jogarDados(jogador);
    }
}

