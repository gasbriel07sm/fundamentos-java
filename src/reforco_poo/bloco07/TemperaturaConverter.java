package reforco_poo.bloco07;

public class TemperaturaConverter {

    public static final double ABSOLUTE_ZERO = -273.15;

    public static double celsiusToFahrenheit(double c) {
        return c * 1.8 + 32;
    }

    public static double celsiusToKelvin(double c) {
        return c + 273.15;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) / 1.8;
    }

    public static double kelvinToCelsius(double k) {
        return k - 273.15;
    }
}
