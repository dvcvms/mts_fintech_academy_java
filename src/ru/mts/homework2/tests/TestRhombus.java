package ru.mts.homework2.tests;

import ru.mts.homework2.GeomFigure;
import ru.mts.homework2.models.figures.angular.Polygon;
import ru.mts.homework2.models.figures.angular.Rhombus;
import ru.mts.homework2.models.point.Point;

import java.util.ArrayList;
import java.util.List;

public class TestRhombus {
    public static void main(String[] args) {

        List<Point> listRhombus = new ArrayList<>();

        listRhombus.add(new Point(3, 6));
        listRhombus.add(new Point(5, 2));
        listRhombus.add(new Point(7, 6));
        listRhombus.add(new Point(5, 10));

        GeomFigure rhombus = new Rhombus(listRhombus, "WHITE");

        System.out.println(rhombus.getColor());
        System.out.println(rhombus.getPerimeter());
        System.out.println(rhombus.getArea());
        System.out.println(rhombus.getInfo());
    }
}
