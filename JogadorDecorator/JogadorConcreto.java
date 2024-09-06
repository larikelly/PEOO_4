package JogadorDecorator;

public class JogadorConcreto implements JogadorInterface {
    private int posição;
    private int moedas;

    public JogadorConcreto() {
        this.posição = 0;
        this.moedas = 0;
    }

    @Override
    public void adicionarMoedas(int quantidade) {
        this.moedas += quantidade;
    }

    @Override
    public void removerMoedas(int quantidade) {
        this.moedas -= quantidade;
    }

    @Override
    public int getPosição() {
        return posição;
    }

    @Override
    public void setPosição(int posição) {
        this.posição = posição;
    }

    @Override
    public int getMoedas() {
        return moedas;
    }

    @Override
    public void aplicarEfeitoCasaSimples() {
        adicionarMoedas(1);
        System.out.println("Você caiu em uma Casa Simples e ganhou 1 moeda.");
    }
}
