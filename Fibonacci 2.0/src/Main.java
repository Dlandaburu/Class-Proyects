public class Main {
    public static void main(String[] args) {
        int n = 10;
        int num1 = 0, num2 = 1;

        System.out.println("Secuencia de Fibonacci (primeros " + n + " términos):");


        System.out.print(num1 + ", " + num2);


        for (int i = 3; i <= n; i++) {
            int siguiente = num1 + num2;
            System.out.print(", " + siguiente);


            num1 = num2;
            num2 = siguiente;
        }

        System.out.println(); 
    }
}