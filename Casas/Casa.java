package Casas;

import Players.Jogador;
import Utils.Tabuleiro;

import java.util.Scanner;

public abstract class Casa {
    protected int numero;

    public Casa(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public abstract void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input);
}
