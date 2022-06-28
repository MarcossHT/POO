import java.util.ArrayList;
import java.util.List;

public class Armazen {
    private List<Produto> produtos = new ArrayList<Produto>();
    private String nome;

    public void addProduto(Produto produto) {
        produtos.add(produto);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double calcEspacoNece() {
        double total = 0;
        for(Produto produto: produtos) {
            total += produto.calcularEspaco();
        }
        return total;
    }
}
