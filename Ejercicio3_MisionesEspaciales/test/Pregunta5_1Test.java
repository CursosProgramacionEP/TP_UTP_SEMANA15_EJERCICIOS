import Modelo.Astronauta;
import Modelo.Mision;
import Modelo.Nave;
import Modelo.RegistroMision;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta5_1Test {
    @Test
    public void testContenidoDelReporte() {
        Mision m1 = new Mision(2031, new Astronauta(1200, "Killa Mamani", "Perú"),
                "MS-501", "Marte", new Nave(6, "X-200", "Aurora"));
        Mision m2 = new Mision(2029, new Astronauta(800, "Inti Rojas", "Bolivia"),
                "MS-502", "Luna", new Nave(4, "C-90", "Cóndor I"));

        Mision[] lista = { m1, m2 };
        String reporte = RegistroMision.generarReporte(lista);
        assertNotNull("El reporte no debe ser nulo", reporte);

        String[] cabeceras = { "CÓDIGO", "DESTINO", "AÑO", "COMANDANTE", "NAVE" };
        for (String cabecera : cabeceras) {
            assertTrue("El reporte debe contener la cabecera " + cabecera, reporte.contains(cabecera));
        }

        String[] datos = { "MS-501", "Marte", "2031", "Killa Mamani", "Aurora",
                           "MS-502", "Luna", "2029", "Inti Rojas", "Cóndor I" };
        for (String dato : datos) {
            assertTrue("El reporte debe contener el dato: " + dato, reporte.contains(dato));
        }

        assertTrue("El reporte debe mostrar el total correcto de misiones",
                reporte.contains("Total de misiones: 2"));
    }
}
