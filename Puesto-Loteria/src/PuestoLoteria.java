public class PuestoLoteria {
    private int numeroGanador;
    public PuestoLoteria() {
        int numeroGanador = (int) (Math.random() * 100000);
        this.numeroGanador = numeroGanador;
    }
    public void venderBoleto(Persona persona) {
        int dineroPersona = persona.consultarDinero();
        if(dineroPersona >= 20){
            int boleto = (int) (Math.random() * 100000);
            persona.comprarBoleto(boleto);
            int dineroDeLaPersona = persona.getDinero();
            persona.setDinero(dineroDeLaPersona - 20);
        } else {
            System.out.println("La persona "+persona.getNombre()+" No tiene suficiente dinero.");
        }
    }
    public void determinarGanador(Persona persona1, Persona persona2, Persona persona3){
        System.out.println("INICIANDO SORTEO, EL GANADOR MÁS CERCANO ES"+this.numeroGanador);
        int boleto1 = persona1.getBoleto();
        int boleto2 = persona2.getBoleto();
        int boleto3 = persona3.getBoleto();
        int diferencia1 = this.numeroGanador - boleto1;
        int diferencia2 = this.numeroGanador - boleto2;
        int diferencia3 = this.numeroGanador - boleto3;
        if(diferencia1<0){
            diferencia1 = diferencia1 * (-1);
        }
        if(diferencia2<0){
            diferencia2 = diferencia2 * (-1);
        }
        if(diferencia3<0){
            diferencia3 = diferencia3 * (-1);
        }
        if(diferencia1<=diferencia2 && diferencia1<=diferencia3){
            persona1.informacionPersona();
        } else if (diferencia2<=diferencia1 && diferencia2<=diferencia3) {
            persona2.informacionPersona();
        } else {
            persona3.informacionPersona();
        }
    }
}
