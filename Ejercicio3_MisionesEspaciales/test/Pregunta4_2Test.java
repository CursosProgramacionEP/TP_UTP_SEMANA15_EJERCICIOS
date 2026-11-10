import Modelo.Astronauta;
import Modelo.Mision;
import Modelo.Nave;
import Modelo.RegistroMision;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta4_2Test {
    @Test
    public void testAgregarConRegistroLleno() {
        RegistroMision registro = new RegistroMision(2);
        Astronauta astronauta = new Astronauta(800, "Inti Rojas", "Bolivia");
        Nave nave = new Nave(4, "C-90", "Cóndor I");
        Mision m1 = new Mision(2029, astronauta, "M1", "Luna", nave);
        Mision m2 = new Mision(2030, astronauta, "M2", "Marte", nave);
        Mision m3 = new Mision(2031, astronauta, "M3", "Europa", nave);

        assertTrue(registro.agregar(m1));
        assertTrue(registro.agregar(m2));
        assertFalse("agregar debe retornar false cuando el arreglo está lleno", registro.agregar(m3));
        assertEquals("Con el registro lleno deben quedar exactamente 2 misiones",
                2, registro.obtenerTodas().length);
    }
}
