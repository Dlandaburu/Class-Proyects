import java.util.Scanner;
import java.util.Random;

public class JuegoAdivinanza {
    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(10) + 1;
        int intento = 0;

        System.out.println("¡Adivina el número secreto entre 1 y 10!");

        while (intento != numeroSecreto) {
            System.out.print("Introduce tu número: ");
            intento = scanner.nextInt();

            if (intento < numeroSecreto) {
                System.out.println("El número secreto es mayor.");
            } else if (intento > numeroSecreto) {
                System.out.println("El número secreto es menor.");
            } else {
                System.out.println("¡Felicidades! Has adivinado el número.");
            }
        }

        scanner.close();
    }
}
