import Modelo.Nave;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta1_2Test {
    @Test
    public void testClaseNave() {
        Nave nave = new Nave(6, "X-200", "Aurora");
        assertEquals(6, nave.getCapacidad());
        assertEquals("X-200", nave.getModelo());
        assertEquals("Aurora", nave.getNombreNave());
        assertEquals("Nave: Aurora (modelo X-200) - 6 tripulantes", nave.toString());
    }
}
