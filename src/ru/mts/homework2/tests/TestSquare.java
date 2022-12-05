package ru.mts.homework2.tests;

import ru.mts.homework2.models.GeomFigure;
import ru.mts.homework2.models.figures.angular.Square;
import ru.mts.homework2.models.Point;

import java.util.ArrayList;
import java.util.List;

public class TestSquare {
    public static void main(String[] args) {
        List<Point> listSquare = new ArrayList<>();
        listSquare.add(new Point(1, 1));
        listSquare.add(new Point(1, 5));
        listSquare.add(new Point(5, 5));
        listSquare.add(new Point(5, 1));

        GeomFigure square = new Square(listSquare, "RED");

        System.out.println(square.getColor());
        System.out.println(square.getPerimeter());
        System.out.println(square.getArea());
        System.out.println(square.getInfo());

        System.out.println("==========");

        square.move(100, 100);
        System.out.println(square.getInfo());
    }
}
