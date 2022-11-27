package ru.mts.homework2.models.figures.angular;

import ru.mts.homework2.models.point.Point;

import java.util.List;

public class Square extends Rhombus {

    public Square(List<Point> listPoint, String color) {
        super(listPoint, color);
        super.setDiagonals(listPoint);
    }

    @Override
    public double getLargerDiagonal() {
        return super.getLargerDiagonal();
    }

    @Override
    public double getSmallerDiagonal() {
        return super.getSmallerDiagonal();
    }

    @Override
    public String getInfo() {
        return "This is Square. Characteristics:" +
                "\nCoordinates: " + getPoints() +
                "\nColor: " + getColor();
    }
}
