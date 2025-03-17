import java.util.Random;

    class Coche {
        private String nombre;
        private int distanciaRecorrida;
        private Random random;

        public Coche(String nombre) {
            this.nombre = nombre;
            this.distanciaRecorrida = 0;
            this.random = new Random();
        }

        public void avanzar() {
            int avance = random.nextInt(10) + 1;
            distanciaRecorrida += avance;
        }

        public String getNombre() {
            return nombre;
        }

        public int getDistanciaRecorrida() {
            return distanciaRecorrida;
        }
    }