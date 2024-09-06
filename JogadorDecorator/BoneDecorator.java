package JogadorDecorator;

import Players.Jogador;

public class BoneDecorator extends JogadorDecorator {

    public BoneDecorator(Jogador jogador) {
        super(jogador);
    }

    @Override
    public void aplicarEfeitoCasaSimples() {
        jogadorDecorado.adicionarMoedas(2);
        System.out.println("Você está usando um boné e ganhou 2 moedas ao cair em uma Casa Simples.");
    }
}
