public class Bola extends Produto{
    private double raio = 0.32;

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularEspaco() {
        double raioQuad = this.raio * this.raio;
        return 4 * (3.14 * raioQuad);
    }
}
