package Players;
import Utils.Dados;

public abstract class Jogador {
    protected int posição, rodadas;
    protected String cor;
    protected boolean pulaProximaRodada;
    protected String tipoDeJogador;
    protected int moedas;

    public Jogador(int posição, String cor) {         
        this.posição = posição;
        this.cor = cor;
        this.rodadas = 0;
        this.pulaProximaRodada = false;
        this.moedas = 0;
    }

    public abstract boolean somaDados(int somaDados);      

    public abstract String getTipoDeJogador();

    public void jogarDados(Jogador jogador) {
        int somadosDados = Dados.rolarDoisDados(jogador); 
        if (somaDados(somadosDados)) {
            posição += somadosDados;
            System.out.println("Jogador " + cor + " jogou os dados e obteve " + somadosDados);
        } else {
            System.out.println("Jogador " + cor + " não conseguiu obter a soma adequada.");
        }
        incrementarRodadas();
    }

    public void incrementarRodadas() {
        rodadas++;
    }

    public int getPosição() {
        return posição;
    }

    public String getCor() {
        return cor;
    }

    public int getRodadas() {
        return rodadas;
    }

    public boolean isPulaProximaRodada() {
        return pulaProximaRodada;
    }

    public void setPulaProximaRodada(boolean pulaProximaRodada) {
        this.pulaProximaRodada = pulaProximaRodada;
    }

    public void setPosição(int posição) {
        this.posição = posição;
    }

    public void setTipoDeJogador(String tipoDeJogador) {
        this.tipoDeJogador = tipoDeJogador;
    }
    
    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }
    
    public int getMoedas() {
        return moedas;
    }
    
    public void adicionarMoedas(int quantidade) {
        this.moedas += quantidade;
        System.out.println("Jogador " + cor + " ganhou " + quantidade + " moedas. Total de moedas: " + moedas);
    }

    public void removerMoedas(int quantidade) {
        this.moedas -= quantidade;
        System.out.println("Jogador " + cor + " perdeu " + quantidade + " moedas. Total de moedas: " + moedas);
    }

    public void aplicarEfeitoCasaSimples() {
        adicionarMoedas(1);
    }

}
