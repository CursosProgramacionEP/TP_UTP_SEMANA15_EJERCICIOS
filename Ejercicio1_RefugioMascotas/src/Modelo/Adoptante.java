package Modelo;

public class Adoptante {
    private String distrito;
    private int edad;
    private String nombre;

    public Adoptante(String distrito, int edad, String nombre) {
        this.distrito = distrito;
        this.edad = edad;
        this.nombre = nombre;
    }

    public String getDistrito() {
        return distrito;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre + " (" + edad + " años) - " + distrito;
    }
}
