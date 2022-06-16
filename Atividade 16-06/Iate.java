public class Iate extends Embarcacao implements Comparable<Iate>{
    private int cabines;

    public Iate(String nome, double precoBase, double comprimento, int anoFabri, int cabines) {
        super(nome, precoBase, comprimento, anoFabri);
        this.cabines = cabines;
    }

    public int getCabines() {
        return cabines;
    }

    @Override
    public int compareTo(Iate iate) {
        if(this.cabines == iate.cabines) {
            return 0;
        }
        if(this.cabines > iate.cabines) {
            return 1;
        }
       return -1;
    }
}
