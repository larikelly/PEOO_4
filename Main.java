import Utils.Jogo;

public class Main {
    public static void main(String[] args) {
        Jogo jogo = new Jogo();
        jogo.configurarJogo();
        jogo.printTabuleiro();
        jogo.start();
    }
}

/* FACADE
public class Main {
public static void main(String args[]){
Jogo jogo = new Jogo();
int numCasas = // ler do teclado o número de casas
int numJogadores = // ler do teclado o número de casas;
jogo.configTabuleiro(numCasas);
jogo.config(numJogadores);
jogo.printTabuleiro();
jogo.start();
}
} */