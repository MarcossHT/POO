public class Asteroide extends Objeto{
    private int danos;

    public Asteroide (int posx, int posy, char direcao, int danos) {
        super(posx, posy, direcao);
        this.danos = danos;
    }
}
