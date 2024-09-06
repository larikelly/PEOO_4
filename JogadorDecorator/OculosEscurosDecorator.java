package JogadorDecorator;

import Players.Jogador;

public class OculosEscurosDecorator extends JogadorDecorator {

    public OculosEscurosDecorator(Jogador jogador) {
        super(jogador);
    }

    @Override
    public void aplicarEfeitoCasaSimples() {
        jogadorDecorado.adicionarMoedas(7);
        System.out.println("Você está usando óculos escuros e ganhou 7 moedas ao cair em uma Casa Simples.");
    }
}
