package shape;

import color.Color;

public abstract class Shape {
    private Color color;

    public abstract double area();

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
