public class Main {
    public static void main(String[] args) {
        Trem trem = new Trem();
        Locomotiva locomotiva = new Locomotiva();
        Vagao vagao = new Vagao();

        trem.addComponentes(locomotiva);
        trem.addComponentes(vagao);

        trem.calcAreaComp();
    }
}