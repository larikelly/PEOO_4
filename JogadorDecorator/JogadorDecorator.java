package JogadorDecorator;

import Players.Jogador;

public abstract class JogadorDecorator extends Jogador {
    protected Jogador jogadorDecorado;

    public JogadorDecorator(Jogador jogador) {
        super(jogador.getPosição(), jogador.getCor());
        this.jogadorDecorado = jogador;
    }

    @Override
    public void adicionarMoedas(int quantidade) {
        jogadorDecorado.adicionarMoedas(quantidade);
    }

    @Override
    public void removerMoedas(int quantidade) {
        jogadorDecorado.removerMoedas(quantidade);
    }

    @Override
    public int getPosição() {
        return jogadorDecorado.getPosição();
    }

    @Override
    public void setPosição(int posição) {
        jogadorDecorado.setPosição(posição);
    }

    @Override
    public int getMoedas() {
        return jogadorDecorado.getMoedas();
    }

    @Override
    public void aplicarEfeitoCasaSimples() {
        jogadorDecorado.aplicarEfeitoCasaSimples();
    }
    @Override
    public boolean somaDados(int somaDados) {
        return jogadorDecorado.somaDados(somaDados);
    }

    @Override
    public String getTipoDeJogador() {
        return jogadorDecorado.getTipoDeJogador();
    }
}
