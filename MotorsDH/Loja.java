import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nome;
    private List<Veiculo> veiculos = new ArrayList<Veiculo>();
    private List<Funcionario> funcionarios = new ArrayList<Funcionario>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void addVeiculo(Veiculo veiculo){
        this.veiculos.add(veiculo);
    }

    public void addFunc(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public double calcValorVeiculos(){
        double total = 0;
        for(Veiculo veiculo: veiculos){
            total += veiculo.getValor();
        }
        System.out.println("Valor total dos veiculos: " + total);
        return total;
    }

    public double calcCustoFunc(){
        double total = 0;
        for(Funcionario funcionario: funcionarios){
            total += funcionario.getPagamento();
        }
        System.out.println("Custo com funcionarios foi de: " + total);
        return total;
    }

    public double calcRendimento(){
        double total = 0;
        for(Veiculo veiculo: veiculos){
            total += veiculo.getRedimentoGerado();
        }
        System.out.println("Redimento gerado pelos veiculos: " + total);
        return total;
    }

    public void quantiFunc(){
        System.out.println("A quantidade de funcionarios e de: " + funcionarios.size());
    }

    public void statusFunc(String nome)throws ExcecaoLoja{
        if(!funcAtivo(nome)){
            throw new ExcecaoLoja("Funcionario " + nome + " nao esta ativo ou nao existe");
        }
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getNome() == nome){
                System.out.println("Nome: " + funcionario.getNome() + "\n"
                        + "Pagamento: " + funcionario.getPagamento());
            }
        }

    }

    public boolean funcAtivo(String nome){
        ArrayList<String> equipe = new ArrayList<String>();
        equipe.add("Ezer");
        equipe.add("Moises");
        equipe.add("Vitor");
        equipe.add("Marcos");
        equipe.add("Marino");
        equipe.add("Duda");

        return equipe.contains(nome);
    }
}
