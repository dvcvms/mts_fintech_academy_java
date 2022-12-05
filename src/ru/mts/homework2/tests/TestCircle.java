package ru.mts.homework2.tests;

import ru.mts.homework2.models.GeomFigure;
import ru.mts.homework2.models.figures.circular.Circle;

public class TestCircle {
    public static void main(String[] args) {
        GeomFigure circle = new Circle(3, 4, 4, "GREEN");

        System.out.println(circle.getColor());
        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
        System.out.println(circle.getInfo());

        System.out.println("==========");

        circle.setColor("RED");
        System.out.println(circle.getColor());
        System.out.println(circle.getInfo());

        System.out.println("==========");

        circle.move(100, 100);
        System.out.println(circle.getInfo());
    }
}
