import Modelo.Banda;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta1Test {
    @Test
    public void testClaseBanda() {
        Banda banda = new Banda("Cumbia amazónica", "Los Mirlos", "Perú");
        assertEquals("getGenero() no retorna el género recibido en el constructor",
                "Cumbia amazónica", banda.getGenero());
        assertEquals("getNombre() no retorna el nombre recibido en el constructor",
                "Los Mirlos", banda.getNombre());
        assertEquals("getPais() no retorna el país recibido en el constructor",
                "Perú", banda.getPais());
        assertEquals("Los Mirlos (Cumbia amazónica, Perú)", banda.toString());
    }
}
