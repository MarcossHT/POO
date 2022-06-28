public class Caixa extends Produto{
    private double comprimento = 10;
    private double altura = 10;
    private double largura = 10;

    public double getComprimento() {
        return comprimento;
    }

    public void setComprimento(double comprimento) {
        this.comprimento = comprimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double calcularEspaco() {
        double bA = this.largura * this.altura;
        double cA = this.comprimento * this.altura;
        double bc = this.largura * this.comprimento;
        return 2*(bA + cA + bc);
    }
}
