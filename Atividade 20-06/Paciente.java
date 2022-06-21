public abstract class Paciente {
    private String dataNascimento;
    private String nome;
    private String sobrenome;
    private boolean primeiraConsulta;

    private Consulta consulta;

    public Paciente(String dataNascimento, String nome, String sobrenome, boolean primeiraConsulta, Consulta consulta) {
        this.dataNascimento = dataNascimento;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.primeiraConsulta = primeiraConsulta;
        this.consulta = consulta;
    }

    public boolean avaliacaoInicial() {
        if(this.primeiraConsulta) {
            System.out.println("O paciente não precisa passar pela avaliacao inicial.");
            return false;
        }
        System.out.println("O paciente passara pela avaliacao inicial.");
        return true;
    }
}
