public class Caminhao extends Veiculo implements Locacao{
    public Caminhao(int anoFabri, String modelo, String marca, boolean docOk, String combustivel, double valor) {
        super(anoFabri, modelo, marca, docOk, combustivel, valor);
    }

    public Caminhao(int anoFabri, String modelo, String marca, String combustivel, double valor) {
        super(anoFabri, modelo, marca, combustivel, valor);
    }

    @Override
    public double locar(int dias) {
        if(isDocOk()) {
            double diaria = getValor()/30;
            double total = diaria * dias;
            setRedimentoGerado(total);
            System.out.println(getModelo() + " Valor total da locacao: " + total);
            return total;
        }
        System.out.println("Este veiculo esta com o doc atrasado");
        return 0;
    }
}
