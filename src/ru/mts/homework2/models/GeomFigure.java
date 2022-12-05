package ru.mts.homework2.models;

public abstract class GeomFigure implements Movable {
    private String color;

    protected GeomFigure(String color) {
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract double getPerimeter();

    public abstract double getArea();

    public abstract String getInfo();
}
