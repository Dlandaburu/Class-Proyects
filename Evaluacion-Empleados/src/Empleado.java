public class Empleado {
    private String nombre;
    private int puntosTrabajos;
    private int puntosActitud;

    public Empleado (String nombre, int puntosTrabajos, int puntosActitud){
        this.nombre = nombre;
        this.puntosTrabajos = puntosTrabajos;
        this.puntosActitud = puntosActitud;
    }
    public void evaluarDesempenio(){
        String desempenio = "";

        if (puntosTrabajos >= 80 && puntosActitud >= 80){
            desempenio = "Excelente";
            if (puntosTrabajos > 90){
                System.out.println("¡ Premio, Bono aprobado !");
            }
        } else if (puntosTrabajos >= 70 && puntosActitud >= 70) {
            desempenio = "Bueno";
        } else if (puntosTrabajos < 70 && puntosActitud <= 70 ) {
            desempenio ="Aceptable";
        } else {
            desempenio ="Necesita mejorar ...";
            System.out.println("Advertencia, el desempeño debe de mejorar !");
        }
        System.out.println("Desempeño de" + nombre + ": " + desempenio);
    }
}

