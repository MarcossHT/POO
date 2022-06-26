public class Main {
    public static void main(String[] args) {
        Rota rota1 = new Rota("Bragado", "Buenos Aires", true);
        Rota rota2 = new Rota("Lujan", "Chivilcoy", false);
        Rota rota3 = new Rota("Suipacha", "Mercedes", false);
        Rota rota4 = new Rota("Chivilcoy", "Alberti ", false);

        Reserva reserva1 = new Reserva(1, rota1, 2);
        Reserva reserva2 = new Reserva(2, rota2, 10);
        Reserva reserva3 = new Reserva(3, rota3, 8);
        Reserva reserva4 = new Reserva(4, rota4, 3);

        Empresa empresa1 = new Empresa();

        empresa1.addReserva(reserva1);
        empresa1.addReserva(reserva2);
        empresa1.addReserva(reserva3);
        empresa1.addReserva(reserva4);

        empresa1.valorTotal();
        try {
            empresa1.quantVezesVisitada("Bragado");
        }catch (DestinyException e) {
            System.out.println(e.getMessage());
        }

    }
}