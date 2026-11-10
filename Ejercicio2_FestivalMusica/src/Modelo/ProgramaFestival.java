package Modelo;

public class ProgramaFestival {
    private int contador;
    private Presentacion[] presentaciones;

    public ProgramaFestival(int capacidad) {
        this.presentaciones = new Presentacion[capacidad];
        this.contador = 0;
    }

    public boolean agregar(Presentacion p) {
        if (contador < presentaciones.length) {
            presentaciones[contador] = p;
            contador++;
            return true;
        }
        return false;
    }

    public Presentacion[] obtenerTodas() {
        Presentacion[] registradas = new Presentacion[contador];
        for (int i = 0; i < contador; i++) {
            registradas[i] = presentaciones[i];
        }
        return registradas;
    }

    public int calcularDuracionTotal() {
        int total = 0;
        for (int i = 0; i < contador; i++) {
            total += presentaciones[i].getDuracionMinutos();
        }
        return total;
    }

    public String listar() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < contador; i++) {
            Presentacion p = presentaciones[i];
            sb.append(i + 1).append(". ")
              .append(p.getCodigo()).append(" - ")
              .append(p.getBanda().getNombre()).append(" - ")
              .append(p.getDuracionMinutos()).append(" min\n");
        }
        sb.append("Duración total: ").append(calcularDuracionTotal()).append(" min");
        return sb.toString();
    }
}
