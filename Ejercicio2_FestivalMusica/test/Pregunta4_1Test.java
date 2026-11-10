import Modelo.Banda;
import Modelo.Presentacion;
import Modelo.ProgramaFestival;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta4_1Test {
    @Test
    public void testAgregarConEspacio() {
        ProgramaFestival programa = new ProgramaFestival(5);
        Banda banda = new Banda("Rock", "Libido", "Perú");
        Presentacion p1 = new Presentacion(banda, "PR-01", 50, "Principal");
        Presentacion p2 = new Presentacion(banda, "PR-02", 30, "Alterno");

        assertTrue("agregar debe retornar true cuando hay espacio", programa.agregar(p1));
        assertEquals("Después de agregar 1 presentación, obtenerTodas() debe tener tamaño 1",
                1, programa.obtenerTodas().length);

        assertTrue("agregar debe retornar true cuando hay espacio", programa.agregar(p2));
        Presentacion[] todas = programa.obtenerTodas();
        assertEquals("Después de agregar 2 presentaciones, obtenerTodas() debe tener tamaño 2",
                2, todas.length);
        assertSame("Las presentaciones deben guardarse en el orden en que se agregan", p1, todas[0]);
        assertSame("Las presentaciones deben guardarse en el orden en que se agregan", p2, todas[1]);
    }
}
