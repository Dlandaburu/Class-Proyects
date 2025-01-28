public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora(10, 5);

        System.out.println("Suma: " + calc.calcular("+"));
        System.out.println("Resta: " + calc.calcular("-"));
        System.out.println("Multiplicación: " + calc.calcular("*"));
        System.out.println("División: " + calc.calcular("/"));
        System.out.println("División por cero: " + calc.calcular("/"));
    }
}