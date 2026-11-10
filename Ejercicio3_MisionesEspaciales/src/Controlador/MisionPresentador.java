package Controlador;

import Modelo.Mision;
import Modelo.RegistroMision;
import Vista.MisionVista;

/**
 * Presentador del Control de Misiones. YA ESTÁ COMPLETO: no lo modifique.
 */
public class MisionPresentador {
    private RegistroMision modelo;
    private MisionVista vista;

    public MisionPresentador(RegistroMision modelo, MisionVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    Mision nueva = vista.pedirDatosMision();
                    if (modelo.agregar(nueva)) {
                        vista.mostrarMensaje("Misión registrada exitosamente.");
                    } else {
                        vista.mostrarMensaje("Error: no hay espacio en el registro.");
                    }
                    break;
                case 2:
                    vista.imprimirLista(modelo.obtenerTodas());
                    break;
                case 3:
                    String reporte = RegistroMision.generarReporte(modelo.obtenerTodas());
                    vista.imprimirReporte(reporte);
                    break;
                case 4:
                    vista.mostrarMensaje("Saliendo del sistema...");
                    break;
                default:
                    vista.mostrarMensaje("Opción no válida.");
            }
        } while (opcion != 4);
    }
}
