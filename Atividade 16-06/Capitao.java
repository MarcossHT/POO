import java.util.ArrayList;
import java.util.List;

public class Capitao {
    private String nome;
    private String sobrenome;
    private int registro;

    private List<Iate> iates = new ArrayList<Iate>();

    private List<Veleiro> veleiros = new ArrayList<Veleiro>();



    public Capitao(String nome, String sobrenome, int registro) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.registro = registro;
    }

    public void fullName() {
        System.out.println("Nome do capitao: " + this.nome + " " + this.sobrenome);
    }

    public void addIate(Iate iate) {
        iates.add(iate);
    }

    public void addVeleiro(Veleiro veleiro) {
        veleiros.add(veleiro);
    }

    public void showVeleiros() {
        for(Veleiro veleiro: veleiros) {
            veleiro.isBig();
        }
    }

    public void iatesLux() {
        iates.sort(null);
        System.out.println("Do menos luxuoso ao mais luxuoso: ");
        for(Iate iate: iates) {
            System.out.println(iate.getNome() + " valor do aluguel: " + iate.calcAlug());
        }
    }
}
