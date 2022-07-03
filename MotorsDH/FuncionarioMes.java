public class FuncionarioMes extends Funcionario{

    public FuncionarioMes(String nome) {
        super(nome);
    }


    @Override
    public double calcPagamento(double valorHora) {
        double dia = valorHora * 8;
        double mes = dia * 30;
        System.out.println(getNome() + " ira receber: " + mes);
        setPagamento(mes);
        return mes;
    }

    @Override
    public void executarTarefa(String tarefa) {
        System.out.println(getNome() + " foi executar a seguinte tarefa: " + tarefa);
    }
}
