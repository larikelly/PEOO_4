package Casas;

import Players.Jogador;
import java.util.Scanner;
import Utils.Tabuleiro;

public class CasaSimples extends Casa {

    public CasaSimples(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        jogador.adicionarMoedas(1);
        System.out.println("Você caiu em uma Casa Simples e ganhou 1 moeda.");
    }
}
