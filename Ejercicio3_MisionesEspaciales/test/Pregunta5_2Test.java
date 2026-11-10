import Modelo.Astronauta;
import Modelo.Mision;
import Modelo.Nave;
import Modelo.RegistroMision;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta5_2Test {

    private static final String GUIONES =
            "-----------------------------------------------------------------------------";

    // Formato exacto esperado (77 guiones; columnas de ancho 10, 15, 5, 20 y 15 separadas por " | ").
    // No se evalúan los espacios al final de cada línea ni el tipo de salto de línea.
    private static final String[] ESPERADO = {
        "CÓDIGO     | DESTINO         | AÑO   | COMANDANTE           | NAVE",
        GUIONES,
        "MS-501     | Marte           | 2031  | Killa Mamani         | Aurora",
        "MS-502     | Luna            | 2029  | Inti Rojas           | Cóndor I",
        GUIONES,
        "Total de misiones: 2"
    };

    @Test
    public void testFormatoExactoDelReporte() {
        Mision m1 = new Mision(2031, new Astronauta(1200, "Killa Mamani", "Perú"),
                "MS-501", "Marte", new Nave(6, "X-200", "Aurora"));
        Mision m2 = new Mision(2029, new Astronauta(800, "Inti Rojas", "Bolivia"),
                "MS-502", "Luna", new Nave(4, "C-90", "Cóndor I"));

        Mision[] lista = { m1, m2 };
        String reporte = RegistroMision.generarReporte(lista);
        assertNotNull("El reporte no debe ser nulo", reporte);

        String normalizado = reporte.replace("\r\n", "\n").replace("\r", "\n");
        normalizado = normalizado.replaceAll("[ \\t]+\\n", "\n").replaceAll("\\s+$", "");
        String[] lineas = normalizado.split("\n", -1);

        assertEquals("El reporte debe tener exactamente " + ESPERADO.length
                + " líneas (cabecera, guiones, una fila por misión, guiones y total)",
                ESPERADO.length, lineas.length);

        for (int i = 0; i < ESPERADO.length; i++) {
            assertEquals("La línea " + (i + 1) + " del reporte no tiene el formato esperado",
                    ESPERADO[i], lineas[i]);
        }
    }
}
