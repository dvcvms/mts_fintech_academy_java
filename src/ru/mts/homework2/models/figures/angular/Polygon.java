package ru.mts.homework2.models.figures.angular;

import ru.mts.homework2.models.GeomFigure;
import ru.mts.homework2.models.Point;
import ru.mts.homework2.models.figures.angular.behaviors.WithAngles;

import java.util.List;

public class Polygon extends GeomFigure implements WithAngles {

    private final List<Point> pointList;
    private final int numberPoints;


    public Polygon(List<Point> pointList, String color) {
        super(color);
        this.pointList = pointList;
        this.numberPoints = pointList.size();
    }

    @Override
    public double getPerimeter() {
        double x0;
        double y0;
        double x1;
        double y1;
        double perimeter = 0;

        x0 = pointList.get(0).getX();
        y0 = pointList.get(0).getY();

        for (int i = 1; i <= numberPoints; i++) {
            int index = i % numberPoints;

            x1 = pointList.get(index).getX();
            y1 = pointList.get(index).getY();

            double xDiff = Math.abs(x1 - x0);
            double yDiff = Math.abs(y1 - y0);

            double lengthBetweenPoints = Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));

            perimeter += lengthBetweenPoints;

            x0 = x1;
            y0 = y1;
        }
        return perimeter;
    }

    @Override
    public double getArea() {
        // To calculate Area used the Gauss formula

        double s1 = 0, s2 = 0;

        for (int i = 0; i < numberPoints - 1; i++) {
            s1 = s1 + pointList.get(i).getX() * pointList.get(i + 1).getY();
            s2 = s2 + pointList.get(i + 1).getX() * pointList.get(i).getY();
        }

        s1 = s1 + pointList.get(numberPoints - 1).getX() * pointList.get(0).getY();
        s2 = s2 + pointList.get(0).getX() * pointList.get(numberPoints - 1).getY();

        return Math.abs(s1 - s2) / 2;
    }

    @Override
    public String getInfo() {
        return "This is a polygon. Characteristics:\n" +
                "There are " + numberPoints + " coordinates: " + getPoints() +
                "\nColor: " + getColor();
    }

    @Override
    public void outputCoordinatesOfPoints() {
        System.out.println(getPoints());
    }

    protected String getPoints() {
        StringBuilder stringPoints = new StringBuilder();

        for (Point point : pointList) {
            stringPoints.append("(")
                    .append(point.getX())
                    .append(", ")
                    .append(point.getY())
                    .append(") ");
        }

        return stringPoints.toString();
    }

    @Override
    public void move(double dx, double dy) {
        for (Point point : pointList) {
            point.move(dx, dy);
        }
    }
}
