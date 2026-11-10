import Modelo.Astronauta;
import Modelo.Mision;
import Modelo.Nave;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta2Test {
    @Test
    public void testClaseMision() {
        Astronauta astronauta = new Astronauta(1200, "Killa Mamani", "Perú");
        Nave nave = new Nave(6, "X-200", "Aurora");
        Mision mision = new Mision(2031, astronauta, "MS-501", "Marte", nave);

        assertEquals(2031, mision.getAnioLanzamiento());
        assertSame("getAstronauta() debe retornar el mismo objeto recibido en el constructor",
                astronauta, mision.getAstronauta());
        assertEquals("MS-501", mision.getCodigo());
        assertEquals("Marte", mision.getDestino());
        assertSame("getNave() debe retornar el mismo objeto recibido en el constructor",
                nave, mision.getNave());

        String esperado = "Misión [MS-501]: destino Marte (2031)\n"
                        + "  -> Comandante: Killa Mamani (Perú, 1200 h de vuelo)\n"
                        + "  -> Nave: Aurora (modelo X-200) - 6 tripulantes";
        assertEquals(esperado, mision.toString());
    }
}
