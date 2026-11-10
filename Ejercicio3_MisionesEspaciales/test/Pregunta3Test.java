import Modelo.RegistroMision;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta3Test {
    @Test
    public void testRegistroRecienCreado() {
        RegistroMision registro = new RegistroMision(5);

        assertNotNull("obtenerTodas() nunca debe retornar null", registro.obtenerTodas());
        assertEquals("Con el registro recién creado, obtenerTodas() debe retornar un arreglo de tamaño 0 "
                + "(la cantidad registrada, no la capacidad)", 0, registro.obtenerTodas().length);
    }
}
