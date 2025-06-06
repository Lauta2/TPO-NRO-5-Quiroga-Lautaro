package Test;



import convertidor.ConversorMoneda;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CotizacionTest {

    @Test
    void testCotizarCero() {
        assertThrows(ArithmeticException.class, () -> {
            new ConversorMoneda(0);
        });
    }
}

