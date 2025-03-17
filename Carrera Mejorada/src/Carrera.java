public class Carrera {
        private Coche[] coches;
        private int vueltas;
        private int distanciaPorVuelta;

        public Carrera(String[] nombresCoches, int vueltas, int distanciaPorVuelta) {
            this.vueltas = vueltas;
            this.distanciaPorVuelta = distanciaPorVuelta;
            coches = new Coche[nombresCoches.length];
            for (int i = 0; i < nombresCoches.length; i++) {
                coches[i] = new Coche(nombresCoches[i]);
            }
        }

        public void comenzarCarrera() {
            int vueltaActual = 0;
            while (vueltaActual < vueltas) {
                System.out.println("\nVuelta " + (vueltaActual + 1));
                for (Coche coche : coches) {
                    coche.avanzar();
                    System.out.println(coche.getNombre() + " ha recorrido " + coche.getDistanciaRecorrida() + " metros.");
                }
                vueltaActual++;
            }
            mostrarResultados();
        }

        public void mostrarResultados() {
            System.out.println("\nResultados finales de la carrera:");
            for (Coche coche : coches) {
                System.out.println(coche.getNombre() + " recorrió un total de " + coche.getDistanciaRecorrida() + " metros.");
            }
        }
    }
