import Modelo.Banda;
import Modelo.Presentacion;
import Modelo.ProgramaFestival;
import org.junit.Test;
import static org.junit.Assert.*;

public class Pregunta5Test {
    @Test
    public void testCalcularDuracionTotal() {
        ProgramaFestival programa = new ProgramaFestival(5);
        assertEquals("Sin presentaciones la duración total es 0", 0, programa.calcularDuracionTotal());

        Banda banda = new Banda("Cumbia", "Bareto", "Perú");
        programa.agregar(new Presentacion(banda, "PR-01", 60, "Principal"));
        programa.agregar(new Presentacion(banda, "PR-02", 45, "Alterno"));
        programa.agregar(new Presentacion(banda, "PR-03", 30, "Principal"));

        assertEquals("La duración total es la suma de las duraciones registradas (60 + 45 + 30)",
                135, programa.calcularDuracionTotal());
    }
}
