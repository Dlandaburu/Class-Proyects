public class Calculadora {

    private double numero1;
    private double numero2;


    public Calculadora(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double calcular(String operacion) {
        if (operacion.equals("+")) {
            return numero1 + numero2;
        } else if (operacion.equals("-")) {
            return numero1 - numero2;
        } else if (operacion.equals("*")) {
            return numero1 * numero2;
        } else if (operacion.equals("/")) {
            if (numero2 != 0) {
                return numero1 / numero2;
            } else {
                System.out.println("Error: No se puede dividir por cero");
                return Double.NaN;
            }
        } else {
            System.out.println("Operación no válida");
            return Double.NaN;
        }
    }
}

