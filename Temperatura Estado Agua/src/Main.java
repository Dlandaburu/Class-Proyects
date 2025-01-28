public class Main {
    public static void main(String[] args) {
        Agua vapor = new Agua(150);
        System.out.println("Analizando la temperatura del agua en forma de vapor");
        vapor.determinarEstado();
        Agua liquido = new Agua(24);
        System.out.println("Analizando la temperatura del agua en estado líquido");
        vapor.determinarEstado();
        Agua solido = new Agua(-72);
        System.out.println("Analizando la temperatura del agua en estado sólido");
        vapor.determinarEstado();
    }
}