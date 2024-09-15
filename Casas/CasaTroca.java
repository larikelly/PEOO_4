package Casas;

import JogadorDecorator.*;
import Players.Jogador;
import java.util.Scanner;
import Utils.Tabuleiro;

public class CasaTroca extends Casa {

    public CasaTroca(int numero) {
        super(numero);
    }

    @Override
    public void aplicarRegra(Jogador jogador, Tabuleiro tabuleiro, Scanner input) {
        boolean escolhaValida = false;
        Jogador jogadorDecorado = jogador;  

        while (!escolhaValida) {
            System.out.println("CASA TROCA: Você pode trocar seus pontos por itens de avatar.");
            System.out.println("Escolha um item: [1] Boné (1 moeda), [2] Moletom (2 moedas), [3] Óculos Escuros (3 moedas), [4] Não trocar");

            int escolha = input.nextInt();

            switch (escolha) {
                case 1:
                    if (jogador.getMoedas() >= 1) {
                        jogador.removerMoedas(1);
                        jogadorDecorado = new BoneDecorator(jogador);
                        System.out.println("Você adquiriu um boné!");
                        escolhaValida = true; 
                    } else {
                        System.out.println("Moedas insuficientes. Você pode optar por não trocar.");
                    }
                    break;
                case 2:
                    if (jogador.getMoedas() >= 2) {
                        jogador.removerMoedas(2);
                        jogadorDecorado = new MoletomDecorator(jogador);
                        System.out.println("Você adquiriu um moletom!");
                        escolhaValida = true; 
                    } else {
                        System.out.println("Moedas insuficientes. Você pode optar por não trocar.");
                    }
                    break;
                case 3:
                    if (jogador.getMoedas() >= 3) {
                        jogador.removerMoedas(3);
                        jogadorDecorado = new OculosEscurosDecorator(jogador);
                        System.out.println("Você adquiriu óculos escuros!");
                        escolhaValida = true;
                    } else {
                        System.out.println("Moedas insuficientes. Você pode optar por não trocar.");
                    }
                    break;
                case 4:
                    System.out.println("Você optou por não trocar nenhum item.");
                    escolhaValida = true; 
                    break;
                default:
                    System.out.println("Escolha inválida. Tente novamente.");
                    break;
            }
        }

        tabuleiro.atualizarJogador(jogadorDecorado);
    }
}
