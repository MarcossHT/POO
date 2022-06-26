import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private List<Reserva> reservas = new ArrayList<Reserva>();

    public void addReserva(Reserva reserva) {
        reservas.add(reserva);
    }

    public double valorTotal() {
       double total = 0;
        for(Reserva reserva: reservas) {
            double valor = reserva.calcValorPassagem();
            total += valor;
        }
        System.out.println("Valor total das reservas: " + total);
        return total;
    }

    public int quantVezesVisitada(String estacao) throws DestinyException {
        if (estacao != "Bragado" && estacao != "Buenos Aires" && estacao != "Luján" &&
        estacao != "Mercedes" && estacao != "Suipacha" && estacao != "Chivilcoy" &&
        estacao != "Alberti ") {
            throw new DestinyException("A estacao informada nao esta disponivel");
        }
        int pessoas = 0;
        for(Reserva reserva: reservas) {
            Rota rota = reserva.getRota();
            int passageiros = reserva.getQuantidadePessoas();
            if(rota.getEstacaoDestino() == estacao) {
                 pessoas += passageiros;
            }
        }
        System.out.println("O numero de pessoas a visitar " + estacao + " , foi: " + pessoas);
        return pessoas;
    }
}
