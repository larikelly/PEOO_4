package JogadorDecorator;

import Players.Jogador;

public class MoletomDecorator extends JogadorDecorator {

    public MoletomDecorator(Jogador jogadorDecorado) {
        super(jogadorDecorado);
    }
    @Override
    public void aplicarEfeitoCasaSimples() {
        jogadorDecorado.adicionarMoedas(2);
        System.out.println("Você está usando óculos escuros e ganhou 2 moedas ao cair em uma Casa Simples.");
    }
}

