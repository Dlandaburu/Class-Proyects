import java.util.Scanner;  // Importa la clase Scanner

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Ingresa un número: ");
        int numero = scanner.nextInt();


        System.out.println("Números impares desde 1 hasta " + numero + ":");
        for (int i = 1; i <= numero; i++) {

            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        // Cerrar el scanner para liberar recursos
        scanner.close();
    }
}