public class Particular extends Paciente{
    private int numeroRg;
    private double valorConsulta;

    public Particular(String dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, Consulta consulta, int numeroRg, double valorConsulta) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta, consulta);
        this.numeroRg = numeroRg;
        this.valorConsulta = valorConsulta;
    }

    public double getValorConsulta() {
        return valorConsulta;
    }

    public void setValorConsulta(double valorConsulta) {
        this.valorConsulta = valorConsulta;
    }
}
