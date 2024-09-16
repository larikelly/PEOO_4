package Players;
/*FACTORY */
public class JogadorFactory {
    
        public Jogador criarJogador(String tipo, String cor) {
            switch (tipo) {
                case "Azarado":
                    return new JogadorAzarado(0, cor);
                case "Sortudo":
                    return new JogadorSortudo(0, cor);
                case "Normal":
                    return new JogadorNormal(0, cor);
                default:
                    throw new IllegalArgumentException("Tipo de jogador desconhecido: " + tipo);
            }
        }
    }
