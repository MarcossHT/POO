public class Main {
    public static void main(String[] args) {
        Armazen armazen1 = new Armazen();
        armazen1.setNome("7sports");
        ProductFactor fabrica = ProductFactor.getInstance();

        BolaFut bolaNike = (BolaFut)fabrica.criaProduto("FUTEBOL");
        Bola bolaTenis = (Bola)fabrica.criaProduto("BOLATENIS");
        Caixa caixa10 = (Caixa)fabrica.criaProduto("CAIXA10X10");

        armazen1.addProduto(bolaNike);
        armazen1.addProduto(bolaTenis);
        armazen1.addProduto(caixa10);

        System.out.println(armazen1.calcEspacoNece());
    }
}