import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class HotelTest {

    @Test
    public void testCalcoloCameraSingola() {
        CameraSingola singola = new CameraSingola(101, 100.0);
        assertEquals(200.0, singola.calcolaTotale(2), "Il costo per 2 notti in singola deve essere 200");
    }

    @Test
    public void testCalcoloCameraDoppiaConExtra() {
        CameraDoppia doppia = new CameraDoppia(202, 100.0, true);
        // 100 base + 25 extra = 125 a notte. Per 2 notti = 250.
        assertEquals(250.0, doppia.calcolaTotale(2), "Il costo della doppia con extra non è corretto");
    }
}


