package Casas;

public class CasaFactory {

        public static Casa criarCasa(int index) {
            if (index == 10 || index == 25 || index == 38) {
                return new CasaPrisao(index);
            } else if (index == 13) {
                return new CasaSurpresa(index);
            } else if (index == 5 || index == 15 || index == 30) {
                return new CasaSorte(index);
            } else if (index == 17 || index == 27) {
                return new CasaTroca(index);
            } else if (index == 20 || index == 35) {
                return new CasaReversa(index);
            } else if (index == 7 || index == 22 || index == 36) {
                return new CasaAzar(index);
            } else if (index == 2 || index == 12 || index == 32) {
                return new CasaJogaDeNovo(index);
            } else {
                return new CasaSimples(index); 
            }
        }
    }

