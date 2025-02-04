import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        class TablaMultiplicar {

            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("Ingresa un número para generar su tabla de multiplicar: ");
                int numero = scanner.nextInt();

                for (int i = 1; i <= 10; i++) {
                    int resultado = numero * i;
                    System.out.print(resultado + (i < 10 ? ", " : "."));
                }

                scanner.close();
            }
        }
    }
}