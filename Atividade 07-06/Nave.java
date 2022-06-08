public class Nave extends Objeto{
    private double velocidade;
    private int vida;

    public Nave(int posx, int posy, char direcao, double velocidade) {
        super(posx, posy, direcao);
        this.velocidade = velocidade;
        this.vida = 100;
    }

    @Override
    public void irA(int posx, int posy, char direcao) {
        if(direcao == super.direcao) {
            System.out.println("Impossivel executar essa manobra, gire primeiro");
        } else {
            super.posx = posx;
            super.posy= posy;
            super.direcao = direcao;
        }
    }
    public char girar(char girar) {
        super.direcao = girar;
        System.out.println("A nave girou para: " + girar);
        return girar;
    }

    public void restaVida(int valor) {
        if(this.vida - valor <= 0) {
            System.out.println("A nave foi destruida!");
        } else {
            this.vida -= valor;
        }
    }
}
