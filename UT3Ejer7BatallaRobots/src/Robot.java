public class Robot {
    public int vida;
    public int ataque;
    public int defensa;

    public Robot(int vida, int ataque, int defensa){
        this.vida = vida;
        this.ataque = ataque;
        this.defensa = defensa;
    }
    public void combatir(Robot oponente){
        if(oponente.ataque > this.defensa){
            this.vida =this.vida - (oponente.ataque - oponente.defensa);
            if (this.vida <= 0){
                System.out.println("El robot a perdido el combate !");
            }
        }
    }
}
