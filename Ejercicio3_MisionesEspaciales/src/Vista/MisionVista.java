package Vista;

import Modelo.Astronauta;
import Modelo.Mision;
import Modelo.Nave;
import java.util.Scanner;

/**
 * Vista del Control de Misiones. YA ESTÁ COMPLETA: no la modifique.
 */
public class MisionVista {
    private Scanner scanner;

    public MisionVista() {
        this.scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("\n--- CONTROL DE MISIONES ESPACIALES ---");
        System.out.println("1. Registrar nueva misión");
        System.out.println("2. Ver todas las misiones");
        System.out.println("3. Generar reporte de misiones");
        System.out.println("4. Salir");
        return leerEntero("Seleccione una opción: ");
    }

    public Mision pedirDatosMision() {
        System.out.println("\n--- DATOS DEL COMANDANTE ---");
        System.out.print("Nombre del astronauta: ");
        String nombre = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        int horasVuelo = leerEntero("Horas de vuelo: ");

        System.out.println("\n--- DATOS DE LA NAVE ---");
        System.out.print("Nombre de la nave: ");
        String nombreNave = scanner.nextLine();
        System.out.print("Modelo: ");
        String modelo = scanner.nextLine();
        int capacidad = leerEntero("Capacidad (tripulantes): ");

        System.out.println("\n--- DATOS DE LA MISIÓN ---");
        System.out.print("Código de la misión: ");
        String codigo = scanner.nextLine();
        System.out.print("Destino: ");
        String destino = scanner.nextLine();
        int anio = leerEntero("Año de lanzamiento: ");

        Astronauta astronauta = new Astronauta(horasVuelo, nombre, pais);
        Nave nave = new Nave(capacidad, modelo, nombreNave);
        return new Mision(anio, astronauta, codigo, destino, nave);
    }

    public void imprimirLista(Mision[] lista) {
        System.out.println("\n--- LISTA DE MISIONES ---");
        if (lista.length == 0) {
            System.out.println("No hay misiones registradas.");
            return;
        }
        for (Mision m : lista) {
            System.out.println(m.toString());
        }
    }

    public void imprimirReporte(String reporte) {
        System.out.println("\n--- REPORTE DE MISIONES ---");
        System.out.println(reporte);
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
