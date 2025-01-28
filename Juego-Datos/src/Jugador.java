public class Jugador {
    public int dado_negro;
    public int dado_carmesi;
    public int dado_esmeralda;

    public Jugador(){
    }
    public void tirarDadaos(int dado_negro, int dado_carmesi, int dado_esmeralda){
        this.dado_negro = dado_negro;
        this.dado_carmesi = dado_carmesi;
        this.dado_esmeralda = dado_esmeralda;
    }

    public void escogerGanador(Jugador oponente){
    if (this.dado_negro == this.dado_carmesi && dado_negro ==dado_esmeralda){
        System.out.println("El jugador principal ha ganado");
    } else if (oponente.dado_negro == dado_carmesi && oponente.dado_negro == oponente.dado_esmeralda){
        System.out.println("El oponente es el ganador");
    } else {
        int sumaDadosJugador1 = this.dado_negro + dado_carmesi + dado_esmeralda; // Jugador 1 es el principal //
        int sumaDadosJugador2 = this.dado_negro + dado_carmesi + dado_esmeralda; // Jugador 2 es el oponente //
        if(sumaDadosJugador1 > sumaDadosJugador2){
            System.out.println("El jugador principal es el ganador");
    } else if (sumaDadosJugador2 < sumaDadosJugador1) {
            System.out.println("El jugador oponente es el ganador");
        } else {
            System.out.println("Empate !");
            }
        }
    }
}
