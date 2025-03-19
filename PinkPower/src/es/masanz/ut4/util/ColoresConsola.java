package es.masanz.ut4.util;

public class ColoresConsola {

    public static final String RESET = "\u001B[0m";
    public static final String ROJO = "\u001B[31m";
    public static final String VERDE = "\u001B[32m";
    public static final String AMARILLO = "\u001B[33m";
    public static final String AZUL = "\u001B[34m";
    public static final String MAGENTA = "\u001B[35m";
    public static final String CIAN = "\u001B[36m";
    public static final String BLANCO = "\u001B[37m";


    public static void imprimirEnRojo(String texto) {
        System.out.println(ROJO + texto + RESET);
    }

    public static void imprimirEnVerde(String texto) {
        System.out.println(VERDE + texto + RESET);
    }

    public static void imprimirEnAmarillo(String texto) {
        System.out.println(AMARILLO + texto + RESET);
    }

    public static void imprimirEnAzul(String texto) {
        System.out.println(AZUL + texto + RESET);
    }
}


class Main {
    public static void main(String[] args) {
        ColoresConsola.imprimirEnRojo("Este es un mensaje en rojo");
        ColoresConsola.imprimirEnVerde("Este es un mensaje en verde");
        ColoresConsola.imprimirEnAmarillo("Este es un mensaje en amarillo");
        ColoresConsola.imprimirEnAzul("Este es un mensaje en azul");
    }
}
