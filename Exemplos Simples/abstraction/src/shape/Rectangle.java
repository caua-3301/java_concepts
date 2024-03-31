package shape;

import color.Color;

public class Rectangle extends Shape  {
    private double width;
    private double heigth;

    public Rectangle(Color color, double width, double heigth) {
        super(color);
        this.width = width;
        this.heigth = heigth;
    }

    @Override
    public double area() {
        return width * heigth;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeigth() {
        return heigth;
    }

    public void setHeigth(double heigth) {
        this.heigth = heigth;
    }
}
