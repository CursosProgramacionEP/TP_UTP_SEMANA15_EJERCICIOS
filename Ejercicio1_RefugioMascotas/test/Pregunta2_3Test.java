import Modelo.Adoptante;
import Modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta2_3Test {
    @Test
    public void testEsCachorro() {
        Adoptante adoptante = new Adoptante("Callao", 41, "Raúl Flores");

        assertTrue("Una mascota de 0 años es cachorro",
                new Mascota(adoptante, 0, "Gato", "Michi").esCachorro());
        assertTrue("Una mascota de 1 año es cachorro",
                new Mascota(adoptante, 1, "Perro", "Toby").esCachorro());
        assertFalse("Una mascota de 2 años ya no es cachorro",
                new Mascota(adoptante, 2, "Perro", "Rocky").esCachorro());
        assertFalse("Una mascota de 9 años no es cachorro",
                new Mascota(adoptante, 9, "Gato", "Luna").esCachorro());
    }
}
