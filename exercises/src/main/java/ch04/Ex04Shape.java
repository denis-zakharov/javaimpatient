package ch04;

import ch02.point.Point;

import java.util.Objects;

abstract class Shape implements Cloneable {
    Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.translate(dx, dy);
    }

    abstract public Point getCenter();
}

final class Circle extends Shape {
    double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }

    @Override
    public Circle clone() {
        try {
            Circle clone = (Circle) super.clone();
            clone.point = new Point(point.getX(), point.getY());
            return clone;
        } catch (CloneNotSupportedException e) { // never happens; suppress in a final class
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return Double.compare(circle.radius, radius) == 0 && circle.point.equals(point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(radius, point);
    }
}

final class Rectangle extends Shape {
    double width;
    double height;

    public Rectangle(Point topLeft, double width, double height) {
        super(topLeft);
        this.width = width;
        this.height = height;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + width / 2, point.getY() + height / 2);
    }

    @Override
    public Rectangle clone() throws CloneNotSupportedException {
        // WRONG IMPLEMENTATION
        // it does a shallow copy of topLeft Point object
        return (Rectangle) super.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rectangle rectangle = (Rectangle) o;
        return Double.compare(rectangle.width, width) == 0 &&
                Double.compare(rectangle.height, height) == 0 &&
                rectangle.point.equals(point);
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height, point);
    }
}

final class Line extends Shape {
    Point to;

    public Line(Point from, Point to) {
        super(from);
        this.to = to;
    }

    @Override
    public Point getCenter() {
        return new Point(point.getX() + (to.getX() - point.getX()) / 2, point.getY() + (to.getY() - point.getY()) / 2);
    }
}

public class Ex04Shape {
    public static void main(String[] args) throws CloneNotSupportedException {
        Circle circle = new Circle(new Point(0, 0), 100);
        Circle clone = circle.clone();
        System.out.println(circle.equals(clone)); // true
        Objects.requireNonNull(clone).moveBy(10, 10);
        System.out.println(circle.equals(clone)); // false, the point object in clone is changed

        Rectangle rectangle = new Rectangle(new Point(0, 100), 1000, 20);
        Rectangle rectangleShallowClone = rectangle.clone();
        System.out.println(rectangle.equals(rectangleShallowClone)); // true
        rectangleShallowClone.moveBy(10, 10);
        System.out.println(rectangle.equals(rectangleShallowClone)); // true, share the same point object
    }
}
