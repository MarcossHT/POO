public class Veleiro extends Embarcacao{
    private int mastros;

    public Veleiro(String nome, double precoBase, double comprimento, int anoFabri, int mastros) {
        super(nome, precoBase, comprimento, anoFabri);
        this.mastros = mastros;
    }

    public boolean isBig() {
        if(this.mastros > 4) {
            System.out.println("Este veleiro " + this.getNome() + " e uma grande embarcacao!" + " Valor do alguel " + this.calcAlug());
            return true;
        }
        System.out.println("Este veleiro " + this.getNome() +" nao e uma grande embarcacao!" + " Valor do alguel " + this.calcAlug());
        return false;
    }
}
