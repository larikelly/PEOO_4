package Utils;
import java.util.Random;
import Players.*;

    public class Dados {

        public static int rolarDoisDados(Jogador jogador) {
            Random random = new Random();
            int dado1, dado2, soma;
    
            if (jogador instanceof JogadorSortudo) {
                do {
                    dado1 = random.nextInt(6) + 1;
                    dado2 = random.nextInt(6) + 1;
                    soma = dado1 + dado2;
                } while (soma < 7); 
            } else if (jogador instanceof JogadorAzarado) {
                do {
                    dado1 = random.nextInt(6) + 1;
                    dado2 = random.nextInt(6) + 1;
                    soma = dado1 + dado2;
                } while (soma > 6);
            } else {
                dado1 = random.nextInt(6) + 1;
                dado2 = random.nextInt(6) + 1;
                soma = dado1 + dado2;
            }
    
            System.out.println("Os valores dos dados são: " + dado1 + " e " + dado2);
            return soma;
        }
    }
    



    