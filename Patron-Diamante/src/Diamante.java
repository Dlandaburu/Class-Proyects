import java.util.Scanner;

public class Diamante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa un número para la fila del medio del diamante: ");
            int n = scanner.nextInt();

            for (int i = 0; i < n; i++) {

                for (int j = 0; j < n - i - 1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 2 * i + 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }

            for (int i = 0; i < n - 1; i++) {

                for (int j = 0; j < i + 1; j++) {
                    System.out.print(" ");
                }

                for (int j = 0; j < 2 * (n - i - 2) + 1; j++) {
                    System.out.print("*");
                }

                System.out.println();
            }
            scanner.close();
        }
    }
