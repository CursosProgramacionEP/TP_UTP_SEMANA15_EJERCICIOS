package Controlador;

import Vista.MascotaVista;

/**
 * Punto de inicio del programa. YA ESTÁ COMPLETO: no lo modifique.
 */
public class Principal {
    public static void main(String[] args) {
        MascotaVista vista = new MascotaVista();
        MascotaPresentador presentador = new MascotaPresentador(vista);
        presentador.iniciar();
    }
}
