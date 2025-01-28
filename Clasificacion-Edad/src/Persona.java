public class Persona {
    public String nombre;
    public int edad;

public Persona(int edad, String nombre){
    this.nombre = nombre;
    this.edad = edad;
    }

    public String clasificarEdad() {

        System.out.println("¿ Cuantos años tienes ?");

            if (edad >0 & edad <= 10) {
                System.out.println("Eres un niño");
                return "niño";

            } else if (edad >10 & edad <= 20) {
                System.out.println("Eres un adolescente");
                return "adolescente";

            } else if (edad > 20 & edad <= 65) {
                System.out.println("Eres ya una persona adulta");
                return "adulta";

            } else if (edad > 65){
                System.out.println("Eres un ancianete");
                return "anciana";
            }
            return "";
    }
}