package ch02;


import ch02.point.ImmutablePoint;
import ch02.point.Point;

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
