import Modelo.Astronauta;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta1_1Test {
    @Test
    public void testClaseAstronauta() {
        Astronauta astronauta = new Astronauta(1200, "Killa Mamani", "Perú");
        assertEquals(1200, astronauta.getHorasVuelo());
        assertEquals("Killa Mamani", astronauta.getNombre());
        assertEquals("Perú", astronauta.getPais());
        assertEquals("Killa Mamani (Perú, 1200 h de vuelo)", astronauta.toString());
    }
}
