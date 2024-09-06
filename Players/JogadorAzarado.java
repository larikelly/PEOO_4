package Players;

public class JogadorAzarado extends Jogador {                       
    public JogadorAzarado(int posição, String cor) {
        super(posição, cor);
        this.tipoDeJogador = "Azarado";
    }

    @Override                                                     
    public String getTipoDeJogador() {
        return "Azarado";
    }

    @Override
    public boolean somaDados(int somaDados) {
        return somaDados <= 6;
    }
    
}



