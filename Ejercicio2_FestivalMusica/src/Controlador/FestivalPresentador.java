package Controlador;

import Modelo.Presentacion;
import Modelo.ProgramaFestival;
import Vista.FestivalVista;

/**
 * Presentador del Festival de Música. YA ESTÁ COMPLETO: no lo modifique.
 */
public class FestivalPresentador {
    private ProgramaFestival modelo;
    private FestivalVista vista;

    public FestivalPresentador(ProgramaFestival modelo, FestivalVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void iniciar() {
        int opcion;
        do {
            opcion = vista.mostrarMenu();
            switch (opcion) {
                case 1:
                    Presentacion nueva = vista.pedirDatosPresentacion();
                    if (modelo.agregar(nueva)) {
                        vista.mostrarMensaje("Presentación agregada al programa.");
                    } else {
                        vista.mostrarMensaje("Error: el programa del festival está lleno.");
                    }
                    break;
                case 2:
                    vista.imprimirDetalle(modelo.obtenerTodas());
                    break;
                case 3:
                    vista.imprimirPrograma(modelo.listar());
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
