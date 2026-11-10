package Modelo;

public class Mision {
    private int anioLanzamiento;
    private Astronauta astronauta;
    private String codigo;
    private String destino;
    private Nave nave;

    public Mision(int anioLanzamiento, Astronauta astronauta, String codigo, String destino, Nave nave) {
        this.anioLanzamiento = anioLanzamiento;
        this.astronauta = astronauta;
        this.codigo = codigo;
        this.destino = destino;
        this.nave = nave;
    }

    public int getAnioLanzamiento() {
        return anioLanzamiento;
    }

    public Astronauta getAstronauta() {
        return astronauta;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDestino() {
        return destino;
    }

    public Nave getNave() {
        return nave;
    }

    @Override
    public String toString() {
        return "Misión [" + codigo + "]: destino " + destino + " (" + anioLanzamiento + ")\n"
             + "  -> Comandante: " + astronauta.toString() + "\n"
             + "  -> " + nave.toString();
    }
}
