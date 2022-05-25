package br.com.digitalhouse.meubanco.models;

public class Cliente {
    private int numeroCliente;
    private String nome;
    private double divida;

    public Cliente(int numero, String nome) {
        this.numeroCliente = numero;
        this.nome = nome;
    }

    public void getCliente() {
        System.out.println(nome);
    }

    public void aumentarDivida(double valor) {
        this.divida += valor;
        System.out.println(divida);
    }

    public void pagarDivida(double valor) {
        this.divida -= valor;
        System.out.println(divida);
    }

    public void getDivida() {
        System.out.println("Sua divida e de " + divida);
    }
}
