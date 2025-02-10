import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);


                System.out.print("Ingresa un número: ");
                int numero = scanner.nextInt();


                System.out.println("Números divisibles por 3:");
                for (int i = 1; i <= numero; i++) {

                    if (i % 3 == 0) {
                        System.out.println(i);
                    }
                }
    }
}