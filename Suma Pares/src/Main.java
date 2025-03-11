import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;

        while (true) {
            System.out.print("Introduce un número entero: ");
            int numero = scanner.nextInt();

            if (numero % 2 == 0) {
                suma += numero;
            } else {
                System.out.println("Número impar detectado. La suma total de los números pares es: " + suma);
                break;
            }
        }

        scanner.close();
    }
}