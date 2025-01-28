public class Main {
    public static void main(String[] args) {
    Jugador Mikel = new Jugador();
    Jugador Harold = new Jugador();

    Mikel.tirarDadaos(7, 2,2);
    Harold.tirarDadaos(9, 2,2);

    Mikel.escogerGanador(Harold);
    }
}