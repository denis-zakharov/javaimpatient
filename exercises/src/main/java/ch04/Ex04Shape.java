package ch04;

import ch02.point.Point;

abstract class Shape {
    Point point;

    public Shape(Point point) {
        this.point = point;
    }

    public void moveBy(double dx, double dy) {
        point.translate(dx, dy);
    }

    abstract public Point getCenter();
}

class Circle extends Shape {
    double radius;

    public Circle(Point center, double radius) {
        super(center);
        this.radius = radius;
    }

    @Override
    public Point getCenter() {
        return point;
    }
}

class Rectangle extends Shape {
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
}

class Line extends Shape {
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
}
