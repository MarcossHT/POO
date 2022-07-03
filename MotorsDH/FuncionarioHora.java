public class FuncionarioHora extends Funcionario{
    private int dias;
    private double horas;


    public FuncionarioHora(String nome, int dias, double horas) {
        super(nome);
        this.dias = dias;
        this.horas = horas;
    }

    public int getDias() {
        return dias;
    }



    @Override
    public void executarTarefa(String tarefa) {
        System.out.println(getNome() + " foi executar a seguinte tarefa: " + tarefa);
    }

    @Override
    public double calcPagamento(double valorHora) {
        double valorDia = this.horas * valorHora;
        double total = valorDia * this.dias;
        System.out.println(getNome() + " ira receber: " + total);
        setPagamento(total);
        return total;
    }
}
