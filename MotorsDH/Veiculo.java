public abstract class Veiculo {
    private int anoFabri;
    private String modelo;
    private String marca;
    private boolean docOk;
    private String combustivel;
    private double valor;
    private double redimentoGerado;

    public double getRedimentoGerado() {
        return redimentoGerado;
    }

    public void setRedimentoGerado(double redimentoGerado) {
        this.redimentoGerado = redimentoGerado;
    }

    public String getModelo() {
        return modelo;
    }


    public boolean isDocOk() {
        return docOk;
    }


    public double getValor() {
        return valor;
    }

    public Veiculo(int anoFabri, String modelo, String marca, boolean docOk, String combustivel, double valor) {
        this.anoFabri = anoFabri;
        this.modelo = modelo;
        this.marca = marca;
        this.docOk = docOk;
        this.combustivel = combustivel;
        this.valor = valor;
    }

    public Veiculo(int anoFabri, String modelo, String marca, String combustivel, double valor) {
        this.anoFabri = anoFabri;
        this.modelo = modelo;
        this.marca = marca;
        this.docOk = true;
        this.combustivel = combustivel;
        this.valor = valor;
    }

}
