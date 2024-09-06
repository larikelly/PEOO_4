package JogadorDecorator;

public interface JogadorInterface {
    void adicionarMoedas(int quantidade);
    void removerMoedas(int quantidade);
    int getPosição();
    void setPosição(int posição);
    int getMoedas();
    void aplicarEfeitoCasaSimples();
}
