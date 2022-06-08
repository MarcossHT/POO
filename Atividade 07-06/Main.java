public class Main {
    public static void main(String[] args) {
        Nave nave1 = new Nave(1, 5, 'N', 2000.50);
        nave1.girar('S');
        nave1.irA(2, 3, 'N');

        Asteroide asteroide1 = new Asteroide(2, 4, 'S', 1000);
        asteroide1.irA(3, 5, 'L');

    }
}