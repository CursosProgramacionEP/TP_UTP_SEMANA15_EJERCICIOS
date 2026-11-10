package Vista;

import Modelo.Adoptante;
import Modelo.Mascota;
import java.util.Scanner;

/**
 * Vista del Refugio de Mascotas. YA ESTÁ COMPLETA: no la modifique.
 */
public class MascotaVista {
    private Scanner scanner;

    public MascotaVista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- REFUGIO DE MASCOTAS ---");
        System.out.println("1. Registrar adopción");
        System.out.println("2. Ver última adopción");
        System.out.println("3. Salir");
        return leerEntero("Seleccione una opción: ");
    }

    public Mascota pedirDatosAdopcion() {
        System.out.println("\n--- DATOS DEL ADOPTANTE ---");
        System.out.print("Nombre del adoptante: ");
        String nombreAdoptante = scanner.nextLine();
        int edadAdoptante = leerEntero("Edad del adoptante: ");
        System.out.print("Distrito: ");
        String distrito = scanner.nextLine();

        System.out.println("\n--- DATOS DE LA MASCOTA ---");
        System.out.print("Nombre de la mascota: ");
        String nombreMascota = scanner.nextLine();
        System.out.print("Especie: ");
        String especie = scanner.nextLine();
        int edadMascota = leerEntero("Edad de la mascota (años): ");

        Adoptante adoptante = new Adoptante(distrito, edadAdoptante, nombreAdoptante);
        return new Mascota(adoptante, edadMascota, especie, nombreMascota);
    }

    public void mostrarMascota(Mascota mascota) {
        System.out.println("\n--- ADOPCIÓN REGISTRADA ---");
        System.out.println(mascota.toString());
        if (mascota.esCachorro()) {
            System.out.println("Nota: es un cachorro, requiere vacunas de refuerzo.");
        }
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
