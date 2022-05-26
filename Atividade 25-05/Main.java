public class Main {
    public static void main(String[] args) {
        Impressora impressora = new Impressora("HP150-03", "wireless", "20/05/2019", 100);

        impressora.getConexao();
        impressora.temPapel();
        impressora.imprimir("Hello World");
        impressora.getFolhas();
        //Cachorros
        Cachorro cachorro = new Cachorro(10, 2020, true, false, "Pitico");
        cachorro.getIdade();
        cachorro.getChip();
        cachorro.getAdocao();
        cachorro.getNome();
        //Cachrros construtor 2
        Cachorro dogo = new Cachorro("Caramelo", 10);
        dogo.getIdade();
        dogo.getChip();
        dogo.getAdocao();
        dogo.getNome();
    }
}