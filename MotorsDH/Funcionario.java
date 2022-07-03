public abstract class Funcionario {
    private String nome;

    private double pagamento;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public double getPagamento() {
        return pagamento;
    }

    public void setPagamento(double pagamento) {
        this.pagamento = pagamento;
    }

    public abstract void executarTarefa(String tarefa);

    public abstract double calcPagamento(double valor);
}