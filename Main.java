import Utils.Jogo;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.configurarJogo();
        jogo.printTabuleiro();
        jogo.start();
    }
}
