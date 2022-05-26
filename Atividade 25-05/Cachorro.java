import org.w3c.dom.ls.LSOutput;

public class Cachorro {
    private int peso;
    private boolean adotavel;
    private int anoNascimento;
    private boolean chip;
    private boolean ferido;
    private String nome;

    Cachorro(int peso, int anoNascimento, boolean chip, boolean ferido, String nome) {
        this.peso = peso;
        this.anoNascimento = anoNascimento;
        this.chip = chip;
        this.ferido = ferido;
        this.nome = nome;
    }

    Cachorro(String nome, int peso) {
        this.nome = nome;
        this.peso = peso;
        this.anoNascimento = 2021;
        this.chip = false;
        this.ferido = true;
    }

    public void getIdade() {
        int idade = 2022 - anoNascimento;
        System.out.println("A idade do doguinho e " + idade);
    }

    public void getChip() {
        System.out.println(chip);
    }

    public boolean getAdocao() {
        if(peso > 5 && ferido == false) {
            System.out.println("O doguinho pode ser adotado");
            return adotavel = true;
        }
        System.out.println("O doguinho nao pode ser adotado");
        return adotavel = false;
    }

    public void getNome() {
        System.out.println("O nome do doguiho e " + nome);
    }
}
