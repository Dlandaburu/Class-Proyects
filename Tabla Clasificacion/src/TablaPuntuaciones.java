import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class TablaPuntuaciones {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            Random random = new Random();
            List<Jugador> jugadores = new ArrayList<>();

            while (true) {
                System.out.print("Introduce el nombre del jugador (deja vacío para terminar): ");
                String nombre = scanner.nextLine().replace(" ", "");

                if (nombre.isEmpty()) {
                    break;
                }

                int puntuacion = random.nextInt(201);
                String rango;
                String color;

                if (puntuacion < 50) {
                    rango = "ROJO";
                    color = ColoresConsola.ROJO;
                } else if (puntuacion <= 100) {
                    rango = "AMARILLO";
                    color = ColoresConsola.AMARILLO;
                } else {
                    rango = "VERDE";
                    color = ColoresConsola.VERDE;
                }

                jugadores.add(new Jugador(nombre, puntuacion, rango, color));
            }

            scanner.close();

            System.out.println("------------------------------------------------");
            System.out.printf("| %-15s | %10s | %-10s |%n", "Jugador", "Puntuación", "Rango");
            System.out.println("------------------------------------------------");

            for (Jugador jugador : jugadores) {
                System.out.printf("| %-15s | %10d | %s%-10s%s |%n", jugador.nombre, jugador.puntuacion, jugador.color, jugador.rango, ColoresConsola.RESET);
            }

            System.out.println("------------------------------------------------");
        }
    }