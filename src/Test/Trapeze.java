package Test;

import java.util.Locale;

public class Trapeze implements Shape {
    private double base1, base2, height;
    private ColorEnum color;

    public Trapeze(ColorEnum color, double base1, double base2, double height) {
        this.color = color;
        this.base1 = base1;
        this.base2 = base2;
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public void draw() {
        System.out.println(this);
    }

    @Override
    public double getArea() {
        return (base1 + base2) / 2 * height;
    }

    @Override
    public ColorEnum getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Фигура: трапеция, площадь: " + String.format(Locale.US, "%.2f", getArea()) + " кв.ед., высота: " + String.format(Locale.US, "%.2f", getHeight()) + " ед., цвет: " + getColor();
    }
}