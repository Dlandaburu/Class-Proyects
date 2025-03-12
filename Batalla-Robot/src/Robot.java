 public class Robot {
        private String nombre;
        private int vida;


        public Robot(String nombre, int vida) {
            this.nombre = nombre;
            this.vida = vida;
        }

        public void atacar(Robot oponente, int danio) {
            oponente.recibirDanio(danio);
            System.out.println(this.nombre + " ataca a " + oponente.getNombre() + ". " + oponente.getNombre() + " tiene " + oponente.getVida() + " puntos de vida.");
        }

        public void recibirDanio(int danio) {
            this.vida -= danio;
        }

        public boolean estaVivo() {
            return this.vida > 0;
        }

        public String getNombre() {
            return this.nombre;
        }

        public int getVida() {
            return this.vida;
        }
    }

