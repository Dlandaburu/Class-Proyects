import java.util.Scanner;

public class Tablanumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números por línea: ");
        int numPorLinea = scanner.nextInt();

        System.out.print("Ingresa el número total hasta el cual se imprimirá la tabla: ");
        int numTotal = scanner.nextInt();

        for (int i = 1; i <= numTotal; i++) {

            System.out.printf("%3d ", i);

            if (i % numPorLinea == 0) {
                System.out.println();
            }
        }

        scanner.close();
    }
}
