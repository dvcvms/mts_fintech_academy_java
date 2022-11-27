package ru.mts.homework2.models.figures.angular;

import ru.mts.homework2.models.figures.angular.behaviors.Diagonals;
import ru.mts.homework2.models.point.Point;

import java.util.List;

public class Rhombus extends Polygon implements Diagonals {

    private double largerDiagonal;
    private double smallerDiagonal;

    public Rhombus(List<Point> pointList, String color) {
        super(pointList, color);
        setDiagonals(pointList);
    }

    protected void setDiagonals(List<Point> pointList) {

        // Calculate the differences between opposite points
        double xDiffFirst = Math.abs(pointList.get(2).getX() - pointList.get(0).getX());
        double yDiffFirst = Math.abs(pointList.get(2).getY() - pointList.get(0).getY());
        double xDiffSecond = Math.abs(pointList.get(3).getX() - pointList.get(1).getX());
        double yDiffSecond = Math.abs(pointList.get(3).getY() - pointList.get(1).getY());

        // Calculate the length of the diagonals
        largerDiagonal = Math.sqrt(xDiffFirst * xDiffFirst + yDiffFirst * yDiffFirst);
        smallerDiagonal = Math.sqrt(xDiffSecond * xDiffSecond + yDiffSecond * yDiffSecond);

        if (largerDiagonal < smallerDiagonal) {
            double t = largerDiagonal;
            largerDiagonal = smallerDiagonal;
            smallerDiagonal = t;
        }
    }

    @Override
    public String getInfo() {
        return "This is a rhombus. Characteristics:\n" +
                "Coordinates: " + getPoints() +
                "\nLength of the larger diagonal: " + getLargerDiagonal() +
                "\nLength of the smaller diagonal: " + getSmallerDiagonal() +
                "\nColor: " + getColor();
    }

    @Override
    public double getLargerDiagonal() {
        return this.largerDiagonal;
    }

    @Override
    public double getSmallerDiagonal() {
        return this.smallerDiagonal;
    }
}
