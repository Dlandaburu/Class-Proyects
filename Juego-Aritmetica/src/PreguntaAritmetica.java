import java.util.Scanner;
import java.util.Random;

     class PreguntaAritmetica {
        private int num1;
        private int num2;
        private boolean esSuma;
        private int resultadoCorrecto;

        public PreguntaAritmetica(Random random) {
            this.num1 = random.nextInt(101);
            this.num2 = random.nextInt(101);
            this.esSuma = random.nextBoolean();
            this.resultadoCorrecto = esSuma ? (num1 + num2) : (num1 - num2);
        }

        public String getPregunta() {
            return "¿Cuánto es " + num1 + (esSuma ? " + " : " - ") + num2 + "? ";
        }

        public boolean esRespuestaCorrecta(int respuesta) {
            return respuesta == resultadoCorrecto;
        }

        public int getResultadoCorrecto() {
            return resultadoCorrecto;
        }
    }
