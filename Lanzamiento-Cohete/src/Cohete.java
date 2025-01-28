public class Cohete {
    public static final int Combustible_minimo = 30;
    public static final int Peso_maximo = 5400;
    public static final int Velocidad_Inicial_Minima = 250;

        public int combustible;
        public int peso;
        public int velocidad;

        public Cohete(int combustible, int peso, int velocidad){
            this.combustible =combustible;
            this.peso = peso;
            this.velocidad = velocidad;
        }

        public boolean puedeDesprgar(){
            boolean puedeDespegar = false;
            if (this.combustible >=Cohete.Combustible_minimo
                && this.peso <=Cohete.Peso_maximo
                && this.velocidad <= Cohete.Velocidad_Inicial_Minima){
                puedeDespegar =true;
            }
            return puedeDespegar;
        }
}
