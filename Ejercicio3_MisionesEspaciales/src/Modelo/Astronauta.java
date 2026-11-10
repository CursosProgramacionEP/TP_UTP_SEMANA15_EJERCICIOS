package Modelo;

public class Astronauta {
    private int horasVuelo;
    private String nombre;
    private String pais;

    public Astronauta(int horasVuelo, String nombre, String pais) {
        this.horasVuelo = horasVuelo;
        this.nombre = nombre;
        this.pais = pais;
    }

    public int getHorasVuelo() {
        return horasVuelo;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return nombre + " (" + pais + ", " + horasVuelo + " h de vuelo)";
    }
}
