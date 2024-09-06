package Casas;

import Players.Jogador;
import Players.JogadorSortudo;
import java.util.Scanner;
import Utils.Tabuleiro;

public class CasaAzar extends Casa {

    public CasaAzar(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        if (!(jogador instanceof JogadorSortudo)) {
            System.out.println("CASA AZAR: Você perdeu 3 moedas.");
            jogador.removerMoedas(3);
        } else {
            System.out.println("CASA AZAR: Mas como você é sortudo, não perde moedas.");
        }
    }
}

