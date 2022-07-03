public class Moto extends Veiculo{
    private double custoFixo;

    public Moto(int anoFabri, String modelo, String marca, boolean docOk, String combustivel, double valor, double custoFixo) {
        super(anoFabri, modelo, marca, docOk, combustivel, valor);
        this.custoFixo = custoFixo;
    }

    public Moto(int anoFabri, String modelo, String marca, String combustivel, double valor, double custoFixo) {
        super(anoFabri, modelo, marca, combustivel, valor);
        this.custoFixo = custoFixo;
    }

    public double valorEntrega(double distancia){
        double total =  distancia * this.custoFixo;
        setRedimentoGerado(total);
        return total;
    }
}
