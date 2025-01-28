public class Persona {
    int edad;
    String nombre;

    public Persona(int edad, String nombre){
        this.edad = edad;
        this.nombre = nombre;
    }

    public boolean esMayorEdad() {
        boolean esMayorEdad = false;

        if (edad >= 18) {
            esMayorEdad = true;
        }

        return esMayorEdad;
    }

}