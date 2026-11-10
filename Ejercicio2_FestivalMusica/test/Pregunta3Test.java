import Modelo.ProgramaFestival;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta3Test {
    @Test
    public void testProgramaRecienCreado() {
        ProgramaFestival programa = new ProgramaFestival(5);

        assertNotNull("obtenerTodas() nunca debe retornar null", programa.obtenerTodas());
        assertEquals("Con el programa recién creado, obtenerTodas() debe retornar un arreglo de tamaño 0 "
                + "(la cantidad registrada, no la capacidad)", 0, programa.obtenerTodas().length);
    }
}
