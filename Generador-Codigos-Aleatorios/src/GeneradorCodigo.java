import java.util.Random;

public class GeneradorCodigo {

    private int longitud;
    private String codigo;

    public GeneradorCodigo(int longitud) {
        this.longitud = longitud;
        this.codigo = "";
    }


    public void generarCodigo() {
        Random random = new Random();
        StringBuilder codigoBuilder = new StringBuilder();


        for (int i = 0; i < longitud; i++) {
            int digitoAleatorio = random.nextInt(10);
            codigoBuilder.append(digitoAleatorio);
        }


        this.codigo = codigoBuilder.toString();
    }



    public String toString() {
        return "El código generado es: " + codigo;
    }


    public static void main(String[] args) {

        GeneradorCodigo generador = new GeneradorCodigo(6);
        generador.generarCodigo();


        System.out.println(generador);
    }
}
