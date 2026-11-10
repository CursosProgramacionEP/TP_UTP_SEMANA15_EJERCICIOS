package Modelo;

public class Mascota {
    private Adoptante adoptante;
    private int edad;
    private String especie;
    private String nombre;

    public Mascota(Adoptante adoptante, int edad, String especie, String nombre) {
        this.adoptante = adoptante;
        this.edad = edad;
        this.especie = especie;
        this.nombre = nombre;
    }

    public Adoptante getAdoptante() {
        return adoptante;
    }

    public int getEdad() {
        return edad;
    }

    public String getEspecie() {
        return especie;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean esCachorro() {
        return edad < 2;
    }

    @Override
    public String toString() {
        return "Mascota: " + nombre + " [" + especie + ", " + edad + " años]\n"
             + "  -> Adoptante: " + adoptante.toString();
    }
}
