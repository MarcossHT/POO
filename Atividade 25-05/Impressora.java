import java.text.SimpleDateFormat;

public class Impressora {
    private String modelo;
    private String tipoConexao;
    private String datafabricacao;
    private int folhasDisponiveis;

    Impressora(String modelo, String tipoConexao, String datafabricacao, int folhasDisponiveis) {
        this.modelo = modelo;
        this.tipoConexao = tipoConexao;
        this.datafabricacao = datafabricacao;
        this.folhasDisponiveis = folhasDisponiveis;
    }

    public boolean temPapel() {
        if(folhasDisponiveis > 0) return true;
        return false;
    }

    public void imprimir(String texto) {
        if (temPapel()) {
            folhasDisponiveis--;
            System.out.println(texto);
        }
        System.out.println("Impressora sem folhas disponiveis");
    }
    public void getFolhas() {
        System.out.println(folhasDisponiveis);
    }
    public void getConexao() {
        System.out.println(tipoConexao);
    }
}
