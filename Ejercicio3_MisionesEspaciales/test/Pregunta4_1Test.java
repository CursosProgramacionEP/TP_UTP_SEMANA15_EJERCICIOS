import Modelo.Astronauta;
import Modelo.Mision;
import Modelo.Nave;
import Modelo.RegistroMision;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta4_1Test {
    @Test
    public void testAgregarConEspacio() {
        RegistroMision registro = new RegistroMision(5);
        Astronauta astronauta = new Astronauta(800, "Inti Rojas", "Bolivia");
        Nave nave = new Nave(4, "C-90", "Cóndor I");
        Mision m1 = new Mision(2029, astronauta, "MS-502", "Luna", nave);

        assertTrue("agregar debe retornar true cuando hay espacio", registro.agregar(m1));
        Mision[] todas = registro.obtenerTodas();
        assertEquals("Después de agregar 1 misión, obtenerTodas() debe tener tamaño 1", 1, todas.length);
        assertSame("obtenerTodas() debe contener la misión agregada", m1, todas[0]);
    }
}
