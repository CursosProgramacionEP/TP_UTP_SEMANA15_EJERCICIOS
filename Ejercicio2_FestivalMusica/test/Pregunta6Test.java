import Modelo.Banda;
import Modelo.Presentacion;
import Modelo.ProgramaFestival;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta6Test {

    // No se evalúan los espacios al final de cada línea ni el tipo de salto de línea
    private static String[] lineasDe(String texto) {
        String normalizado = texto.replace("\r\n", "\n").replace("\r", "\n");
        normalizado = normalizado.replaceAll("[ \\t]+\\n", "\n").replaceAll("\\s+$", "");
        return normalizado.split("\n", -1);
    }

    @Test
    public void testListarConPresentaciones() {
        ProgramaFestival programa = new ProgramaFestival(5);
        programa.agregar(new Presentacion(new Banda("Cumbia amazónica", "Los Mirlos", "Perú"),
                "PR-01", 60, "Principal"));
        programa.agregar(new Presentacion(new Banda("Cumbia", "Bareto", "Perú"),
                "PR-02", 45, "Alterno"));

        String programaTexto = programa.listar();
        assertNotNull("listar() no debe retornar null", programaTexto);

        String[] esperado = {
            "1. PR-01 - Los Mirlos - 60 min",
            "2. PR-02 - Bareto - 45 min",
            "Duración total: 105 min"
        };
        String[] lineas = lineasDe(programaTexto);
        assertEquals("El listado debe tener una línea por presentación más la línea de duración total",
                esperado.length, lineas.length);
        for (int i = 0; i < esperado.length; i++) {
            assertEquals("La línea " + (i + 1) + " del listado no tiene el formato esperado",
                    esperado[i], lineas[i]);
        }
    }

    @Test
    public void testListarSinPresentaciones() {
        ProgramaFestival programa = new ProgramaFestival(5);
        String programaTexto = programa.listar();
        assertNotNull("listar() no debe retornar null", programaTexto);

        String[] lineas = lineasDe(programaTexto);
        assertEquals("Sin presentaciones el listado solo tiene la línea de duración total",
                1, lineas.length);
        assertEquals("Duración total: 0 min", lineas[0]);
    }
}
