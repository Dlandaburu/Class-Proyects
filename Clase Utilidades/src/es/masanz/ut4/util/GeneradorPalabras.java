package es.masanz.ut4.util;

import java.util.Random;

public class GeneradorPalabras {

    public static final String PALABRAS = "Gato Perro Rana León Oso Koala Canguro Cocodrilo Cebra Ajolote Rinoceronte Araña Tiburón Iguana Camaleón Jaguar Mono";


    public static String obtenerPalabra() {
        String[] palabrasArray = PALABRAS.split(" ");
        Random random = new Random();
        return palabrasArray[random.nextInt(palabrasArray.length)];
    }
}


