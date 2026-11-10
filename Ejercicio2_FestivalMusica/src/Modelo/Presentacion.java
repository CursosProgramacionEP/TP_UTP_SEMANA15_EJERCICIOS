package Modelo;

public class Presentacion {
    private Banda banda;
    private String codigo;
    private int duracionMinutos;
    private String escenario;

    public Presentacion(Banda banda, String codigo, int duracionMinutos, String escenario) {
        this.banda = banda;
        this.codigo = codigo;
        this.duracionMinutos = duracionMinutos;
        this.escenario = escenario;
    }

    public Banda getBanda() {
        return banda;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    public String getEscenario() {
        return escenario;
    }

    @Override
    public String toString() {
        return "Presentación [" + codigo + "] en escenario " + escenario + " (" + duracionMinutos + " min)\n"
             + "  -> Banda: " + banda.toString();
    }
}
