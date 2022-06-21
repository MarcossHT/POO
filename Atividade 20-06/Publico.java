public class Publico extends Paciente implements Comparable<Publico>{
    private int numeroSus;

    public Publico(String dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, Consulta consulta, int numeroSus) {
        super(dataNascimento, nome, sobrenome, primeiraConsulta, consulta);
        this.numeroSus = numeroSus;
    }

    @Override
    public int compareTo(Publico publico) {
        if(this.numeroSus == publico.numeroSus) {
            return 0;
        }
        if(this.numeroSus > publico.numeroSus) {
            return 1;
        }
        return -1;
    }
}
