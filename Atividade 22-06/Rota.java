public class Rota {
    private String estacaoDestino;
    private String getEstacaoPartida;
    private boolean direta;

    public Rota(String estacaoDestino, String getEstacaoPartida, boolean direta) {
        this.estacaoDestino = estacaoDestino;
        this.getEstacaoPartida = getEstacaoPartida;
        this.direta = direta;
    }

    public String getEstacaoDestino() {
        return estacaoDestino;
    }

    public String getGetEstacaoPartida() {
        return getEstacaoPartida;
    }

    public boolean isDireta() {
        return direta;
    }
}
