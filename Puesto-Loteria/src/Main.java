public class Main {
    public static void main(String[] args) {

        PuestoLoteria puesto = new PuestoLoteria();

        Persona persona1 = new Persona("Aitana", 50);
        Persona persona2 = new Persona("Patrick", 11);
        Persona persona3 = new Persona("Lucía", 100);

        puesto.venderBoleto(persona1);
        puesto.venderBoleto(persona2);
        puesto.venderBoleto(persona3);

        puesto.determinarGanador(persona1, persona2, persona3);
    }
}