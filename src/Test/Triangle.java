package Test;

import java.util.Locale;

public class Triangle implements Shape {
    private double side1, side2, side3;
    private ColorEnum color;

    public Triangle(ColorEnum color, double side1, double side2, double side3) {
        this.color = color;
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getHypotenuse() {
        double hypotenuse = 0;
        double[] arr = {side1, side2, side3};

        for (double i : arr) {
            if (hypotenuse < i) hypotenuse = i;
        }
        return hypotenuse;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        double p = (side1 + side2 + side3) / 2;
        double s = Math.sqrt((p * (p - side1) * (p - side2) * (p - side3)));
        return s;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: треугольник, площадь: " + String.format(Locale.US, "%.2f", getArea()) + " кв.ед., гипотенуза: " + String.format(Locale.US, "%.2f", getHypotenuse()) + " ед., цвет: " + getColor();
    }
}
