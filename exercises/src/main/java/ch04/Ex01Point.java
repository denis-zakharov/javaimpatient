package ch04;

import ch04.point.Point;

import java.util.ArrayList;

class LabeledPoint extends Point {
    String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    /*
    Compile-time error: when overridden method has a weaker access, e.g. `void method` instead of `public void method`
    'method()' in 'ch04.LabeledPoint' clashes with 'method()' in 'ch04.point.Point';
     attempting to assign weaker access privileges ('package-private'); was 'public'
     */
    public void method() {
        System.out.println(x + y); // can access public/protected fields of a parent class in other package directly
    }
}

public class Ex01Point {

    public static void main(String[] args) {
        LabeledPoint label = new LabeledPoint(1, 2, "Label");
        label.method();

        // Cannot access protected fields outside class or sub-class in other package
        /*System.out.println(label.x);
        System.out.println(new Point(5, 6).x);*/

        // extend using anonymous class
        ArrayList<Point> list = new ArrayList<>(100) {
            @Override
            public boolean add(Point point) {
                System.out.println("Adding point: " + point);
                return super.add(point);
            }
        };
        list.add(label);
    }
}
