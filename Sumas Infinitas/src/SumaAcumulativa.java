import java.util.Scanner;
public class SumaAcumulativa {
        public static void main(String[] args) {
            Suma suma = new Suma();
            int resultado = suma.sumarNumeros();
            System.out.println("La suma total es: " + resultado);
        }
    }

    class Suma {
        public int sumarNumeros() {
            Scanner scanner = new Scanner(System.in);
            int suma = 0;
            int numero;

            System.out.println("Introduce números enteros para sumar (ingresa 0 para terminar):");

            while (true) {
                numero = scanner.nextInt();
                if (numero == 0) {
                    break;
                }
                suma += numero;
            }

            scanner.close();
            return suma;
        }
    }
