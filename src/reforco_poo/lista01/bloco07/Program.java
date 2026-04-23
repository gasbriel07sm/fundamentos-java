package reforco_poo.lista01.bloco07;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Temperature: ");
        double temperature = sc.nextDouble();

        System.out.print("Unit (C/F/K): ");
        char ch = Character.toUpperCase(sc.next().charAt(0));

        if (ch == 'C') {
            System.out.printf("%.2f °C =%n", temperature);
            System.out.printf("  %.2f °F%n", TemperaturaConverter.celsiusToFahrenheit(temperature));
            System.out.printf("  %.2f K%n", TemperaturaConverter.celsiusToKelvin(temperature));
        }
        else if (ch == 'F') {
            double celsius = TemperaturaConverter.fahrenheitToCelsius(temperature);
            System.out.printf("%.2f °F =%n", temperature);
            System.out.printf("  %.2f °C%n", celsius);
            System.out.printf("  %.2f K%n", TemperaturaConverter.celsiusToKelvin(celsius));
        }
        else if (ch == 'K') {
            double celsius = TemperaturaConverter.kelvinToCelsius(temperature);
            System.out.printf("%.2f K =%n", temperature);
            System.out.printf("  %.2f °C%n", celsius);
            System.out.printf("  %.2f °F%n", TemperaturaConverter.celsiusToFahrenheit(celsius));
        }

        System.out.printf("Absolute zero: %.2f ºC %n", TemperaturaConverter.ABSOLUTE_ZERO);

        sc.close();
    }
}
