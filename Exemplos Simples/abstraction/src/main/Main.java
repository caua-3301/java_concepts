package main;

import color.Color;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Shape shape01 = new Rectangle(Color.RED, 10, 5);
        Shape shape02 = new Circle(Color.BLACK, 3);

        System.out.printf("Circle area: %.2f %n", shape02.area());
        System.out.printf("Rectangle area: %.2f %n", shape01.area());
    }
}
