package Test;


import convertidor.ConversorMoneda;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorTest {

    private ConversorMoneda conversor;

    @BeforeAll
    static void initAll() {
        System.out.println("Bienvenido al Conversor de Moneda");
    }

    @BeforeEach
    void setUp(TestInfo info) {
        conversor = new ConversorMoneda(120.0); // 1 USD = 120 pesos
        System.out.println("Ejecutando: " + info.getDisplayName());
    }

    @AfterEach
    void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterAll
    static void endAll() {
        System.out.println("Todas las pruebas han finalizado");
    }

    @Test
    @DisplayName("Conversión de pesos a dólares")
    void testConvertirADolares() {
        assertEquals(1000 / 120.0, conversor.convertirADolares(1000), 0.001);
    }

    @Test
    @DisplayName("Conversión de dólares a pesos")
    void testConvertirAPesos() {
        assertEquals(1200 * 120, conversor.convertirAPesos(1200), 0.001);
    }

    @Test
    @DisplayName("Sumar dólares a una cuenta")
    void testSumarDolares() {
        assertEquals(500 + 100, conversor.sumarEnDolares(500, 100));
    }

    @Test
    @DisplayName("Extraer dólares de una cuenta")
    void testExtraerDolares() {
        assertEquals(1000 - 300, conversor.extraerEnDolares(1000, 300));
    }
}


