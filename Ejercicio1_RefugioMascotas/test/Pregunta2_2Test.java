import Modelo.Adoptante;
import Modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta2_2Test {
    @Test
    public void testToStringDeMascota() {
        Adoptante adoptante = new Adoptante("Miraflores", 28, "Lucía Quispe");
        Mascota mascota = new Mascota(adoptante, 3, "Perro", "Rocky");

        String esperado = "Mascota: Rocky [Perro, 3 años]\n"
                        + "  -> Adoptante: Lucía Quispe (28 años) - Miraflores";
        assertEquals(esperado, mascota.toString());
    }
}
