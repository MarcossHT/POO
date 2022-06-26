public class Reserva {
    private int codigo;
    private Rota rota;
    private int quantidadePessoas;

    public Reserva(int codigo, Rota rota, int quantidadePessoas) {
        this.codigo = codigo;
        this.rota = rota;
        this.quantidadePessoas = quantidadePessoas;
    }

    public double calcValorPassagem() {
        int valorBase = 50 * quantidadePessoas;
        if(this.rota.isDireta()) {
            return valorBase - (valorBase * 0.20);
        }
        return valorBase;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    public Rota getRota() {
        return rota;
    }
}
