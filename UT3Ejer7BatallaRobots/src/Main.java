import java.awt.Robot;

public class Main {
    public static void main(String[] args) {
        Robot bender = new Robot(10, 5, 3);
        Robot Axxa = new Robot(9, 5, 6);
        Newcombate(bender, Axxa);
    }
    public static void Newcombate(Robot bender, Robot Axxa) {
        bender.combatir(Axxa);
        if(bender.vida > 0){
            Axxa.combatir(bender);
            if(Axxa.vida > 0){
                Newcombate(bender, Axxa);
            } else {
                System.out.println("bender ha perdido");
            }
        } else {
            System.out.println("Axxa ha perdido");
        }
    }
}