import java.util.ArrayList;
import java.util.List;

public class Trem {
    private List<Componentes>componentes = new ArrayList<Componentes>();

    public void addComponentes(Componentes componente) {
        componentes.add(componente);
    }

    public double calcAreaComp() {
        double total = 0;
        for(Componentes componente: componentes) {
            total += componente.calcArea();
        }
        System.out.println("Area total do trem: " + total);
        return total;
    }

}
