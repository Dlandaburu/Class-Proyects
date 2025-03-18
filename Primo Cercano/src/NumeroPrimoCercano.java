import java.util.Scanner;
public class NumeroPrimoCercano {

        public static boolean esPrimo(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Introduce un número: ");
            int numero = scanner.nextInt();
            scanner.close();

            int menor = numero;
            int mayor = numero;

            while (true) {
                if (esPrimo(menor)) {
                    System.out.println("El número primo más cercano es: " + menor);
                    break;
                }
                if (esPrimo(mayor)) {
                    System.out.println("El número primo más cercano es: " + mayor);
                    break;
                }
                menor--;
                mayor++;
            }
        }
    }