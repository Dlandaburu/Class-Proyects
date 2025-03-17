public class SimulacionCarrera {
        public static void main(String[] args) {
            String[] nombresCoches = {"Ferrari", "Lamborghini", "McLaren"};
            int vueltas = 5;
            int distanciaPorVuelta = 100;

            Carrera carrera = new Carrera(nombresCoches, vueltas, distanciaPorVuelta);
            carrera.comenzarCarrera();
        }
    }
