import Modelo.Banda;
import Modelo.Presentacion;
import Modelo.ProgramaFestival;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta4_2Test {
    @Test
    public void testAgregarConProgramaLleno() {
        ProgramaFestival programa = new ProgramaFestival(2);
        Banda banda = new Banda("Rock", "Libido", "Perú");
        Presentacion p1 = new Presentacion(banda, "PR-01", 50, "Principal");
        Presentacion p2 = new Presentacion(banda, "PR-02", 30, "Alterno");
        Presentacion p3 = new Presentacion(banda, "PR-03", 40, "Principal");

        assertTrue(programa.agregar(p1));
        assertTrue(programa.agregar(p2));
        assertFalse("agregar debe retornar false cuando el arreglo está lleno", programa.agregar(p3));
        assertEquals("Con el programa lleno deben quedar exactamente 2 presentaciones",
                2, programa.obtenerTodas().length);
    }
}
