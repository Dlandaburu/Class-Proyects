import java.util.Scanner;

public class JuegoDados {

    int puntajeJugador1;
    int puntajeJugador2;


    public JuegoDados() {
        this.puntajeJugador1 = 0;
        this.puntajeJugador2 = 0;
    }


    public int lanzarDado() {

        return (int)(Math.random() * 6) + 1;
    }


    public void jugar(int numRondas) {
        for (int ronda = 1; ronda <= numRondas; ronda++) {

            int dado1Jugador1 = lanzarDado();
            int dado2Jugador1 = lanzarDado();
            puntajeJugador1 += dado1Jugador1 + dado2Jugador1;


            int dado1Jugador2 = lanzarDado();
            int dado2Jugador2 = lanzarDado();
            puntajeJugador2 += dado1Jugador2 + dado2Jugador2;

            System.out.println("Ronda " + ronda + ":");
            System.out.println("Jugador 1 lanza: " + dado1Jugador1 + " y " + dado2Jugador1 + " -> Puntaje: " + (dado1Jugador1 + dado2Jugador1));
            System.out.println("Jugador 2 lanza: " + dado1Jugador2 + " y " + dado2Jugador2 + " -> Puntaje: " + (dado1Jugador2 + dado2Jugador2));
            System.out.println("Puntajes acumulados - Jugador 1: " + puntajeJugador1 + " | Jugador 2: " + puntajeJugador2);
            System.out.println();
        }
    }

    public String toString() {
        if (puntajeJugador1 > puntajeJugador2) {
            return "¡El jugador 1 es el ganador con " + puntajeJugador1 + " puntos!";
        } else if (puntajeJugador2 > puntajeJugador1) {
            return "¡El jugador 2 es el ganador con " + puntajeJugador2 + " puntos!";
        } else {
            return "¡Es un empate! Ambos jugadores tienen " + puntajeJugador1 + " puntos.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa el número de rondas a jugar: ");
        int numRondas = scanner.nextInt();

        JuegoDados juego = new JuegoDados();

        juego.jugar(numRondas);

        System.out.println(juego.toString());
    }
}
