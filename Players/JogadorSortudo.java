package Players;

public class JogadorSortudo extends Jogador {
    public JogadorSortudo(int posição, String cor) {
        super(posição, cor);
        this.tipoDeJogador = "Sortudo";

    }

    @Override
    public String getTipoDeJogador() {
        return "Sortudo";
    }
    
    @Override
    public boolean somaDados(int somaDados) {
        return somaDados >= 7;
    }
}


