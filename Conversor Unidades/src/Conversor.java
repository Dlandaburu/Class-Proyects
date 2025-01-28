public class Conversor {
    private double valorMetros;

    public Conversor (double valor){
        valorMetros = valor;
    }

    public void convertir (String unidad){
        double resultado;

        if(unidad.equalsIgnoreCase("Kilómetros")){
            resultado = valorMetros / 1000;
            System.out.println(valorMetros + " metros son " + resultado + " kilómetros. ");

        } else if (unidad.equalsIgnoreCase("centímetros")){
            resultado =valorMetros * 100;
            System.out.println(valorMetros + " metros son " + resultado + " centímetros ");
        }

        else {
            System.out.println(" ERROR 404 La unidad que has puesto no es válida. Sólo se puede convertir a 'Kilómetros' o 'centímetros'.");
        }
    }
}
