import java.util.Random;
public class PiramideAsteriscos {

        public static void main(String[] args) {
            final int altura_minima = 3;
            Random random = new Random();
            int altura = random.nextInt(10) + 1;

            if (altura > 2) {
                altura++;
            }

            altura = Math.max(altura, altura_minima);

            int i = 1;
            while (i <= altura) {
                for (int j = 0; j < altura - i; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < (2 * i - 1); k++) {
                    System.out.print("*");
                }

                System.out.println();
                i++;
            }
        }
    }

