package Controlador;

import Modelo.ProgramaFestival;
import Vista.FestivalVista;

/**
 * Punto de inicio del programa. YA ESTÁ COMPLETO: no lo modifique.
 */
public class Principal {
    public static void main(String[] args) {
        // El programa del festival admite como máximo 5 presentaciones
        ProgramaFestival modelo = new ProgramaFestival(5);
        FestivalVista vista = new FestivalVista();
        FestivalPresentador presentador = new FestivalPresentador(modelo, vista);
        presentador.iniciar();
    }
}
