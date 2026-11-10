package Controlador;

import Modelo.RegistroMision;
import Vista.MisionVista;

/**
 * Punto de inicio del programa. YA ESTÁ COMPLETO: no lo modifique.
 */
public class Principal {
    public static void main(String[] args) {
        // El registro admite como máximo 100 misiones
        RegistroMision modelo = new RegistroMision(100);
        MisionVista vista = new MisionVista();
        MisionPresentador presentador = new MisionPresentador(modelo, vista);
        presentador.iniciar();
    }
}
