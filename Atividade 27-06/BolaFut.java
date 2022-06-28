public class BolaFut extends Produto{
    private double raio = 11;

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
