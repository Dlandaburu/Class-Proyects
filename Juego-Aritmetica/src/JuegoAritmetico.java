import java.util.Scanner;
import java.util.Random;

class JuegoAritmetico {
    private static final int ACIERTOS_NECESARIOS = 5;
    private int aciertos;
    private Scanner scanner;
    private Random random;

    public JuegoAritmetico() {
        this.aciertos = 0;
        this.scanner = new Scanner(System.in);
        this.random = new Random();
    }

    public void jugar() {
        System.out.println("¡Bienvenido al juego de aritmética! Debes acertar " + ACIERTOS_NECESARIOS + " preguntas.");

        while (aciertos < ACIERTOS_NECESARIOS) {
            PreguntaAritmetica pregunta = new PreguntaAritmetica(random);
            System.out.print(pregunta.getPregunta());
            int respuestaUsuario = scanner.nextInt();

            if (pregunta.esRespuestaCorrecta(respuestaUsuario)) {
                aciertos++;
                System.out.println("¡Correcto! Llevas " + aciertos + " aciertos.");
            } else {
                System.out.println("Incorrecto. La respuesta correcta era " + pregunta.getResultadoCorrecto() + ".");
            }
        }

        System.out.println("¡Felicidades! Has acertado " + ACIERTOS_NECESARIOS + " preguntas y completado el juego.");
        scanner.close();
    }
}
