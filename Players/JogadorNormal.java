package Players;

public class JogadorNormal extends Jogador {
    public JogadorNormal(int posição, String cor) {
        super(posição, cor);
        this.tipoDeJogador = "Normal";

    }

    @Override
    public String getTipoDeJogador() {
        return "Normal";
    }
    
    @Override
    public boolean somaDados(int somaDados) {
        return true; 
}
}
