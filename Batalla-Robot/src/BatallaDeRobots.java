 public class BatallaDeRobots {
        public static void main(String[] args) {

            Robot robot1 = new Robot("Robot 1", 100);
            Robot robot2 = new Robot("Robot 2", 100);
            int danio = 20;


            while (robot1.estaVivo() && robot2.estaVivo()) {

                robot1.atacar(robot2, danio);


                if (!robot2.estaVivo()) {
                    break;
                }


                robot2.atacar(robot1, danio);


                if (!robot1.estaVivo()) {
                    break;
                }
            }


            if (robot1.estaVivo()) {
                System.out.println(robot1.getNombre() + " gana con " + robot1.getVida() + " puntos de vida restantes.");
            } else {
                System.out.println(robot2.getNombre() + " gana con " + robot2.getVida() + " puntos de vida restantes.");
            }
        }
    }
