package org.example;

public class CompareFigures {
    public static int compareAreas(Circle circle, Rectangle rectangle) {
        return Double.compare(circle.getArea(), rectangle.getArea());
    }

    public static int compareAreas(Rectangle rectangle, Triangle triangle) {
        return Double.compare(rectangle.getArea(), triangle.getArea());
    }
}
