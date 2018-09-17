package ch02;

class ImmutablePoint {
    private double x;
    private double y;

    public ImmutablePoint() {
        this.x = 0;
        this.y = 0;
    }

    public ImmutablePoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    ImmutablePoint translate(double diffX, double diffY) {
        return new ImmutablePoint(x + diffX, y + diffY);
    }

    ImmutablePoint scale(double scale) {
        return new ImmutablePoint(x * scale, y * scale);
    }

    @Override
    public String toString() {
        return "ch02.ImmutablePoint{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

class Point {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    void translate(double diffX, double diffY) {
        x += diffX;
        y += diffY;
    }

    void scale(double scale) {
        x *= scale;
        y *= scale;
    }

    @Override
    public String toString() {
        return "ch02.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Ex5678 {
    public static void main(String[] args) {
        ImmutablePoint p = new ImmutablePoint(3, 4).translate(1, 3).scale(0.5);
        System.out.println(p);

        Point p2 = new Point(3, 4);
        p2.translate(1, 3);
        p2.scale(0.5);
        System.out.println(p2);
    }
}
