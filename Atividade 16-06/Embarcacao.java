public abstract class Embarcacao {
    private String nome;
    private double precoBase;
    private double valorAdc;
    private double comprimento;
    private int anoFabri;

    public Embarcacao(String nome, double precoBase, double comprimento, int anoFabri) {
        this.nome = nome;
        this.precoBase = precoBase;
        this.comprimento = comprimento;
        this.anoFabri = anoFabri;
    }

    public String getNome() {
        return nome;
    }

    public void setValorAdc(double valorAdc) {
        this.valorAdc = valorAdc;
    }

    public double calcAlug() {
        if(this.anoFabri > 2020 && this.valorAdc == 0) {
            return 0;
        }
        if(this.anoFabri > 2020) {

            return this.precoBase + this.valorAdc;
        }
        return this.precoBase;
    }
}
