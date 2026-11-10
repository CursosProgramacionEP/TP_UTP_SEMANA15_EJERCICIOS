package Modelo;

public class Nave {
    private int capacidad;
    private String modelo;
    private String nombreNave;

    public Nave(int capacidad, String modelo, String nombreNave) {
        this.capacidad = capacidad;
        this.modelo = modelo;
        this.nombreNave = nombreNave;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public String getModelo() {
        return modelo;
    }

    public String getNombreNave() {
        return nombreNave;
    }

    @Override
    public String toString() {
        return "Nave: " + nombreNave + " (modelo " + modelo + ") - " + capacidad + " tripulantes";
    }
}
