package ch02.point;

/**
 * Object of <code>class Immutable Point</code>
 * is a representation of a Cartesian 2D-point.
 * @author Denis
 * @version 1.0
 */
public class ImmutablePoint {
    private double x;
    private double y;

    /**
     * Default constructor to represent (0, 0) point.
     */
    public ImmutablePoint() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructor sets a point's coordinates
     * @param x axis X coordinate
     * @param y axis Y coordiante
     */
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

    /**
     * Move point relative to axis X and axis Y
     * @param diffX a value to move coordinate X on
     * @param diffY a value to move coordinate X on
     * @return a new ImmutablePoint with translated coordinates
     */
    public ImmutablePoint translate(double diffX, double diffY) {
        return new ImmutablePoint(x + diffX, y + diffY);
    }

    public ImmutablePoint scale(double scale) {
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
