import Modelo.Adoptante;
import Modelo.Mascota;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta2_1Test {
    @Test
    public void testConstructorYGettersDeMascota() {
        Adoptante adoptante = new Adoptante("Miraflores", 28, "Lucía Quispe");
        Mascota mascota = new Mascota(adoptante, 3, "Perro", "Rocky");

        assertSame("getAdoptante() debe retornar el mismo objeto recibido en el constructor",
                adoptante, mascota.getAdoptante());
        assertEquals("getEdad() no retorna la edad recibida en el constructor",
                3, mascota.getEdad());
        assertEquals("getEspecie() no retorna la especie recibida en el constructor",
                "Perro", mascota.getEspecie());
        assertEquals("getNombre() no retorna el nombre recibido en el constructor",
                "Rocky", mascota.getNombre());
    }
}
