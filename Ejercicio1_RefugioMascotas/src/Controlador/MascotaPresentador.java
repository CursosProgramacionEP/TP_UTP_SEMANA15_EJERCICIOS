package Controlador;

import Modelo.Mascota;
import Vista.MascotaVista;

/**
 * Presentador del Refugio de Mascotas. YA ESTÁ COMPLETO: no lo modifique.
 */
public class MascotaPresentador {
    private MascotaVista vista;
    private Mascota ultimaAdopcion;

    public MascotaPresentador(MascotaVista vista) {
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    ultimaAdopcion = vista.pedirDatosAdopcion();
                    vista.mostrarMascota(ultimaAdopcion);
                    break;
                case 2:
                    if (ultimaAdopcion == null) {
                        vista.mostrarMensaje("Todavía no se registró ninguna adopción.");
                    } else {
                        vista.mostrarMascota(ultimaAdopcion);
                    }
                    break;
                case 3:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 3);
    }
}
