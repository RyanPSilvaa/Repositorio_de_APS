package edu.uea;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = Arrays.asList(new Circle(), new Rectangle());
        Visitor areaCalculator = new AreaCalculator();

        for (Shape shape : shapes) {
            shape.accept(areaCalculator);
        }
    }
}