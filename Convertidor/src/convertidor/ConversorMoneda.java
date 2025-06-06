
package convertidor;


public class ConversorMoneda {

    private double cotizacion; // Ej: 1 USD = 120 pesos

    public ConversorMoneda(double cotizacion) {
        if (cotizacion == 0) throw new ArithmeticException("Cotización no puede ser 0");
        this.cotizacion = cotizacion;
    }

    public double convertirADolares(double pesos) {
        return pesos / cotizacion;
    }

    public double convertirAPesos(double dolares) {
        return dolares * cotizacion;
    }

    public double sumarEnDolares(double cuentaDolares, double nuevoDolar) {
        return cuentaDolares + nuevoDolar;
    }

    public double extraerEnDolares(double cuentaDolares, double extraccion) {
        return cuentaDolares - extraccion;
    }

    public double getCotizacion() {
        return cotizacion;
    }
}

