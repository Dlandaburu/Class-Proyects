public class Main {
    public static void main(String[] args) {


        Empleado emp1 = new Empleado("Matias", 85, 90);
        Empleado emp2 = new Empleado("Katy", 70, 80);
        Empleado emp3 = new Empleado("Jaime", 65, 70);
        Empleado emp4 = new Empleado("Patrick", 65, 70);
        Empleado emp5 = new Empleado("Aitana", 50, 53);

        emp1.evaluarDesempenio();
        emp2.evaluarDesempenio();
        emp3.evaluarDesempenio();
        emp4.evaluarDesempenio();
        emp5.evaluarDesempenio();

    }
}