package br.com.digitalhouse.meubanco.models;

public class Jogo {
    private String nome;
    private String nickname;
    private int pontuacao;
    private int nivel;

    Jogo(String nome, String nickname) {
        this.nome = nome;
        this.nickname = nickname;
    }
    public void aumentarPontuacao() {
        this.pontuacao++;
        System.out.println("Sua pontuacao e " + pontuacao);
    }

    public void subirNivel() {
        this.nivel++;
        System.out.println("Seu nivel agora e " + nivel);
    }

    public void bonus(int bonus) {
        this.pontuacao += bonus;
        System.out.println("Voce recebeu um bonus, sua pontuacao agora e " + pontuacao);
    }
}
