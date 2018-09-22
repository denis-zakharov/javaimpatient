package ch04.point;

public class Point {
    protected double x; // package access + subclasses
    protected double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void method() {
        System.out.println("Point method");
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
