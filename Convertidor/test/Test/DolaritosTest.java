package Test;


import convertidor.ConversorMoneda;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DolaritosTest {

    static Stream<org.junit.jupiter.params.provider.Arguments> datosDeSuma() {
        return Stream.of(
                org.junit.jupiter.params.provider.Arguments.of(180000, 1500, 181500),
                org.junit.jupiter.params.provider.Arguments.of(120, 120000, 120120),
                org.junit.jupiter.params.provider.Arguments.of(100000, 0, 100000),
                org.junit.jupiter.params.provider.Arguments.of(-900, 111.11, -788.89)
        );
    }

    @ParameterizedTest
    @MethodSource("datosDeSuma")
    void testSumaDolares(double a, double b, double esperado) {
        ConversorMoneda conversor = new ConversorMoneda(100); // Cotización cualquiera
        assertEquals(esperado, conversor.sumarEnDolares(a, b), 0.01);
    }
}
