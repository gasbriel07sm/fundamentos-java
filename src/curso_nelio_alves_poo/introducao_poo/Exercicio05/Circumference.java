package curso_nelio_alves_poo.introducao_poo.Exercicio05;

public class Circumference {

    public static double volume(double radius) {
        return Math.PI * Math.pow(radius, 3) * (4 / 3.0);
    }

    public static double circumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
