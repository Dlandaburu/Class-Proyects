public class Tienda {
    private double precio;
    private double descuento;

    public Tienda (double precio, double descuento){
        this.precio = precio;
        this.descuento =descuento;
    }

    public void precioMayora100(){
        boolean precioMayora100 = false;

        if (precio < 100){
        precioMayora100 = true;
        descuento = 10;
            }
        precio -= precio/10;

         if (precio >=100){
            precioMayora100 = false;
            descuento = 0;

            precio = 100;

             System.out.println(precio);
        }
    }
}

