public class Objeto {
    protected int posx;
    protected int posy;
    protected char direcao;

    public Objeto(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy= posy;
        this.direcao = direcao;
    }


    public void irA(int posx, int posy, char direcao) {
        this.posx = posx;
        this.posy= posy;
        this.direcao = direcao;
        System.out.println("As coordenadas sao: " + posx + ", " + posy + ", " + direcao);
    }
}
