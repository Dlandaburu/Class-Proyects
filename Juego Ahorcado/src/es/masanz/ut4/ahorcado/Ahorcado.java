package es.masanz.ut4.ahorcado;

import java.util.Scanner;
import java.util.Random;


public class Ahorcado {

    private static final String[] PALABRAS = {"java", "python", "javascript", "C++", "C#", "Html", "Typescript", "React", "ThreeJs", "mouse", "teclado", "programacion", "ordenador"};
    private String palabraSecreta, palabraMostrada, letrasIntentadas;
    private int intentosRestantes;

    public Ahorcado() {
        intentosRestantes = 6;
        letrasIntentadas = "";
        palabraSecreta = PALABRAS[new Random().nextInt(PALABRAS.length)];
        palabraMostrada = "_".repeat(palabraSecreta.length()).replace("", " ").trim();
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        while (intentosRestantes > 0 && palabraMostrada.contains("_")) {
            System.out.println("Palabra: " + palabraMostrada + "  Intentos restantes: " + intentosRestantes);
            System.out.print("Introduce una letra: ");
            char letra = scanner.next().charAt(0);

            if (letrasIntentadas.indexOf(letra) >= 0) {
                System.out.println("¡Ya intentaste esa letra!");
            } else {
                letrasIntentadas += letra;
                if (palabraSecreta.indexOf(letra) >= 0) {
                    System.out.println("¡Buena letra!");
                    actualizarPalabraMostrada(letra);
                } else {
                    System.out.println("¡Letra incorrecta!");
                    intentosRestantes--;
                }
            }
        }

        if (palabraSecreta.equals(palabraMostrada.replace(" ", ""))) {
            System.out.println("¡Ganaste! La palabra era: " + palabraSecreta);
        } else {
            System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
        }

        scanner.close();
    }

    private void actualizarPalabraMostrada(char letra) {
        StringBuilder sb = new StringBuilder(palabraMostrada);
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) {
                sb.setCharAt(i * 2, letra);
            }
        }
        palabraMostrada = sb.toString();
    }

    public static void main(String[] args) {
        new Ahorcado().jugar();
    }
}
