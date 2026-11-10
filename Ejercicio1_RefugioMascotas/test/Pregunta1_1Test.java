import Modelo.Adoptante;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta1_1Test {
    @Test
    public void testConstructorYGettersDeAdoptante() {
        Adoptante adoptante = new Adoptante("Miraflores", 28, "Lucía Quispe");
        assertEquals("getDistrito() no retorna el distrito recibido en el constructor",
                "Miraflores", adoptante.getDistrito());
        assertEquals("getEdad() no retorna la edad recibida en el constructor",
                28, adoptante.getEdad());
        assertEquals("getNombre() no retorna el nombre recibido en el constructor",
                "Lucía Quispe", adoptante.getNombre());
    }
}
