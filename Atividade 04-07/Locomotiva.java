public class Locomotiva implements Componentes{
    @Override
    public double calcArea() {
        double retangulo = 5 * 4;
        double circulo = 3.14;
        double triangulo = 4 / 2;
        return retangulo + (circulo * 2) + triangulo;
    }
}
