public class ColoresConsola {

        public static final String RESET = "\u001B[0m";
        public static final String ROJO = "\u001B[31m";
        public static final String AMARILLO = "\u001B[33m";
        public static final String VERDE = "\u001B[32m";
    }

    class Jugador {
        String nombre;
        int puntuacion;
        String rango;
        String color;

        public Jugador(String nombre, int puntuacion, String rango, String color) {
            this.nombre = nombre;
            this.puntuacion = puntuacion;
            this.rango = rango;
            this.color = color;
        }
    }