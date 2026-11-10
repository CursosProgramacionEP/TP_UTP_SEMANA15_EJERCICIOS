import Modelo.Banda;
import Modelo.Presentacion;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta2Test {
    @Test
    public void testClasePresentacion() {
        Banda banda = new Banda("Cumbia amazónica", "Los Mirlos", "Perú");
        Presentacion p = new Presentacion(banda, "PR-01", 60, "Principal");

        assertSame("getBanda() debe retornar el mismo objeto recibido en el constructor",
                banda, p.getBanda());
        assertEquals("PR-01", p.getCodigo());
        assertEquals(60, p.getDuracionMinutos());
        assertEquals("Principal", p.getEscenario());

        String esperado = "Presentación [PR-01] en escenario Principal (60 min)\n"
                        + "  -> Banda: Los Mirlos (Cumbia amazónica, Perú)";
        assertEquals(esperado, p.toString());
    }
}
