public class Main {
    public static void main(String[] args) {

        Cohete mercuryRedstone = new Cohete(30, 3200, 250);
        boolean puedeDespegar = mercuryRedstone.puedeDesprgar();
        if (puedeDespegar){
            System.out.println("Listos para el Despegue");
        } else {
        }  System.out.println("Algo Falla, debe de ser revisado");
    }
}