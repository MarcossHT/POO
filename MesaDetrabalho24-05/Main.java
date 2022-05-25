package br.com.digitalhouse.meubanco.models;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1, "Marquim");
        cliente.getCliente();
        cliente.aumentarDivida(1000);
        cliente.pagarDivida(950);
        cliente.getDivida();
        //classe jogo;
        Jogo jogo = new Jogo("Marino", "Klinger");
        jogo.subirNivel();
        jogo.aumentarPontuacao();
        jogo.bonus(15);
    }
}
