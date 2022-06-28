public class ProductFactor {
    private static ProductFactor instance;

    private ProductFactor(){};

    public static ProductFactor getInstance(){
        if(instance == null){
            instance = new ProductFactor();
        }
        return instance;
    }

    public Produto criaProduto(String tipoProduto){
        if(tipoProduto.equals("CAIXA10X10")){
            return new Caixa();
        }
        if(tipoProduto.equals("FUTEBOL")){
            return new BolaFut();
        }
        if(tipoProduto.equals("BOLATENIS")){
            return new Bola();
        }
        return null;
    }
}
