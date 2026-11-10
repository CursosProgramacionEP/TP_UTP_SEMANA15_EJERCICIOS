package Vista;

import Modelo.Banda;
import Modelo.Presentacion;
import java.util.Scanner;

/**
 * Vista del Festival de Música. YA ESTÁ COMPLETA: no la modifique.
 */
public class FestivalVista {
    private Scanner scanner;

    public FestivalVista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- FESTIVAL DE MÚSICA ---");
        System.out.println("1. Agregar presentación");
        System.out.println("2. Ver detalle de las presentaciones");
        System.out.println("3. Ver programa del festival");
        System.out.println("4. Salir");
        return leerEntero("Seleccione una opción: ");
    }

    public Presentacion pedirDatosPresentacion() {
        System.out.println("\n--- DATOS DE LA BANDA ---");
        System.out.print("Nombre de la banda: ");
        String nombre = scanner.nextLine();
        System.out.print("Género musical: ");
        String genero = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();

        System.out.println("\n--- DATOS DE LA PRESENTACIÓN ---");
        System.out.print("Código de la presentación: ");
        String codigo = scanner.nextLine();
        System.out.print("Escenario: ");
        String escenario = scanner.nextLine();
        int duracion = leerEntero("Duración (minutos): ");

        Banda banda = new Banda(genero, nombre, pais);
        return new Presentacion(banda, codigo, duracion, escenario);
    }

    public void imprimirDetalle(Presentacion[] lista) {
        System.out.println("\n--- DETALLE DE PRESENTACIONES ---");
        if (lista.length == 0) {
            System.out.println("No hay presentaciones registradas.");
            return;
        }
        for (Presentacion p : lista) {
            System.out.println(p.toString());
        }
    }

    public void imprimirPrograma(String programa) {
        System.out.println("\n--- PROGRAMA DEL FESTIVAL ---");
        System.out.println(programa);
    }

    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private int leerEntero(String etiqueta) {
        while (true) {
            System.out.print(etiqueta);
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Ingrese un número entero válido.");
            }
        }
    }
}
