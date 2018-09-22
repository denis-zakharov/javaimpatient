package ch02.point;

import java.util.Objects;

/**
 * Object of <code>class Point</code>
 * is a representation of a Cartesian 2D-point.
 * @see ch02.point.ImmutablePoint
 * @author Denis
 * @version 1.0
 */
public class Point {
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

    public void translate(double diffX, double diffY) {
        x += diffX;
        y += diffY;
    }

    public void scale(double scale) {
        x *= scale;
        y *= scale;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Point point = (Point) o;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }

    @Override
    public String toString() {
        return "ch02.Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
