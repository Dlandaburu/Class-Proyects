package es.masanz.ut4.wordle;
import java.util.Scanner;

public class Wordle {
    private static final int INTENTOS_MAXIMOS = 6;
    private final String palabraDelDia;

    public Wordle(String palabraDelDia) {
        this.palabraDelDia = palabraDelDia.toUpperCase();
    }

    public Wordle() {
        this.palabraDelDia = GeneradorPalabras.obtenerPalabra().toUpperCase();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        int intentos = 0;
        boolean acertado = false;

        System.out.println("¡Bienvenido a Wordle! Tienes " + INTENTOS_MAXIMOS + " intentos para adivinar la palabra.");

        while (intentos < INTENTOS_MAXIMOS && !acertado) {
            System.out.print("Introduce una palabra: ");
            String palabraUsuario = scanner.nextLine().toUpperCase();

            if (palabraUsuario.length() != palabraDelDia.length()) {
                System.out.println("La palabra debe tener " + palabraDelDia.length() + " letras.");
                continue;
            }

            mostrarResultado(palabraUsuario);
            intentos++;
            if (palabraUsuario.equals(palabraDelDia)) {
                acertado = true;
                System.out.println("¡Felicidades! Has adivinado la palabra.");
            }
        }

        if (!acertado) {
            System.out.println(" Lo siento, Has agotado los intentos. La palabra era: " + palabraDelDia);
        }
        scanner.close();
    }

    private void mostrarResultado(String palabraUsuario) {
        StringBuilder resultado = new StringBuilder();

        for (int i = 0; i < palabraUsuario.length(); i++) {
            char letraUsuario = palabraUsuario.charAt(i);
            char letraCorrecta = palabraDelDia.charAt(i);

            if (letraUsuario == letraCorrecta) {
                resultado.append(ColoresConsola.VERDE).append(letraUsuario).append(ColoresConsola.RESET);
            } else if (palabraDelDia.contains(String.valueOf(letraUsuario))) {
                resultado.append(ColoresConsola.AMARILLO).append(letraUsuario).append(ColoresConsola.RESET);
            } else {
                resultado.append(ColoresConsola.ROJO).append(letraUsuario).append(ColoresConsola.RESET);
            }
        }
        System.out.println(resultado);
    }

    public static void main(String[] args) {
        Wordle juego = new Wordle();
        juego.jugar();
    }
}

class GeneradorPalabras {
    public static String obtenerPalabra() {
        return "PERRO";
    }
}

class ColoresConsola {
    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String VERDE = "\u001B[32m";
}