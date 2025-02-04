import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar el número
        System.out.print("Introduce un número entero positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("El número debe ser positivo.");
        } else {
            long factorial = 1;

            // Calcular el factorial con el bucle
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            // Mostrar el resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}