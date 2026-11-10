import Modelo.Adoptante;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta1_2Test {
    @Test
    public void testToStringDeAdoptante() {
        Adoptante adoptante = new Adoptante("Miraflores", 28, "Lucía Quispe");
        assertEquals("Lucía Quispe (28 años) - Miraflores", adoptante.toString());

        Adoptante otro = new Adoptante("Callao", 41, "Raúl Flores");
        assertEquals("Raúl Flores (41 años) - Callao", otro.toString());
    }
}
