public class Comparador {
    public int mayorDeTres(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }
    public static void main(String[] args) {
        Comparador comparador = new Comparador();

        int resultado = comparador.mayorDeTres(10, 25, 15);

        System.out.println("El mayor de los tres números es: " + resultado);
    }
}
