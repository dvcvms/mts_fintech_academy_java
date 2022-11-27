package ru.mts.homework2.models.figures.circular;

import ru.mts.homework2.models.GeomFigure;
import ru.mts.homework2.models.Point;

public class Circle extends GeomFigure {

    private Point center;
    private double radius;

    public Circle(double centerX, double centerY, double radius, String color) {
        super(color);
        this.center = new Point(centerX, centerY);
        this.radius = radius;
    }

    public Point getCenter() {
        return this.center;
    }

    public double getRadius() {
        return this.radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String getInfo() {
        return "This is a Circle. Characteristics:\n" +
                "Center: " + "(" + this.center.getX() +
                ", " + this.center.getY() + ")\n" +
                "Radius: " + this.radius + "\n" +
                "Colour: " + getColor();
    }

    @Override
    public void move(double dx, double dy) {
        this.center.move(dx, dy);
    }
}
