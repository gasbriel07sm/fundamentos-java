package curso_nelio_alves_poo.interfaces.Problema02.entities;

import curso_nelio_alves_poo.interfaces.Problema02.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
