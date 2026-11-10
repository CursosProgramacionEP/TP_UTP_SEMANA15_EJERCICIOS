package Modelo;

public class RegistroMision {
    private int contador;
    private Mision[] misiones;

    public RegistroMision(int capacidad) {
        this.misiones = new Mision[capacidad];
        this.contador = 0;
    }

    public boolean agregar(Mision m) {
        if (contador < misiones.length) {
            misiones[contador] = m;
            contador++;
            return true;
        }
        return false;
    }

    public Mision[] obtenerTodas() {
        Mision[] registradas = new Mision[contador];
        for (int i = 0; i < contador; i++) {
            registradas[i] = misiones[i];
        }
        return registradas;
    }

    public static String generarReporte(Mision[] lista) {
        String formato = "%-10s | %-15s | %-5s | %-20s | %-15s\n";
        String guiones = "-".repeat(77) + "\n";

        StringBuilder sb = new StringBuilder();
        sb.append(String.format(formato, "CÓDIGO", "DESTINO", "AÑO", "COMANDANTE", "NAVE"));
        sb.append(guiones);
        for (Mision m : lista) {
            sb.append(String.format(formato,
                    m.getCodigo(),
                    m.getDestino(),
                    m.getAnioLanzamiento(),
                    m.getAstronauta().getNombre(),
                    m.getNave().getNombreNave()));
        }
        sb.append(guiones);
        sb.append("Total de misiones: ").append(lista.length);
        return sb.toString();
    }
}
