public class Temporizador {
    private int tiempoParcial;

    public Temporizador(int tiempoParcial){
        this.tiempoParcial = tiempoParcial;
    }

    public void iniciarTemporizador(){

        for (int i=tiempoParcial; i>= 0; i--){
            System.out.println("Tiempo restante: " +i+ " segundos");
        }
        System.out.println("¡Tiempo terminado!");
    }
    public static void main(String[] args){
        Temporizador temporizador = new Temporizador(10);
        temporizador.iniciarTemporizador();
    }
}
