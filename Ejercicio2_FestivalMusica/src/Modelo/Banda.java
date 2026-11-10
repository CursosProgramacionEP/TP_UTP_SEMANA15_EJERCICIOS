package Modelo;

public class Banda {
    private String genero;
    private String nombre;
    private String pais;

    public Banda(String genero, String nombre, String pais) {
        this.genero = genero;
        this.nombre = nombre;
        this.pais = pais;
    }

    public String getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPais() {
        return pais;
    }

    @Override
    public String toString() {
        return nombre + " (" + genero + ", " + pais + ")";
    }
}
