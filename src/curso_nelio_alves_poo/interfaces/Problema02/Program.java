package curso_nelio_alves_poo.interfaces.Problema02;

import curso_nelio_alves_poo.interfaces.Problema02.entities.AbstractShape;
import curso_nelio_alves_poo.interfaces.Problema02.entities.Circle;
import curso_nelio_alves_poo.interfaces.Problema02.entities.Rectangle;
import curso_nelio_alves_poo.interfaces.Problema02.entities.Shape;
import curso_nelio_alves_poo.interfaces.Problema02.enums.Color;

import java.util.Locale;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        AbstractShape s1 = new Circle(Color.BLACK, 2.0);
        AbstractShape s2 = new Rectangle(Color.BLACK, 3.0, 4.0);

        System.out.println("Circle color: " + s1.getColor());
        System.out.printf("Circle area: %.3f%n", s1.area());
        System.out.println("Rectangle color: " + s2.getColor());
        System.out.printf("Rectangle area: %.3f%n", s2.area());
    }
}
