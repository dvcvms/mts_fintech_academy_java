package ru.mts.homework2.tests;

import ru.mts.homework2.GeomFigure;
import ru.mts.homework2.models.figures.angular.Polygon;
import ru.mts.homework2.models.point.Point;

import java.util.ArrayList;
import java.util.List;

public class TestPolygon {
    public static void main(String[] args) {

        List<Point> listPolygon = new ArrayList<>();

        listPolygon.add(new Point(12, 8));
        listPolygon.add(new Point(5, 11));
        listPolygon.add(new Point(3, 4));
        listPolygon.add(new Point(5, 6));
        listPolygon.add(new Point(9, 5));

        GeomFigure polygon = new Polygon(listPolygon, "BLUE");

        System.out.println(polygon.getColor());
        System.out.println(polygon.getPerimeter());
        System.out.println(polygon.getArea());
        System.out.println(polygon.getInfo());

    }
}
