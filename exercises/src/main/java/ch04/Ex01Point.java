package ch04;

import ch04.point.Point;

class LabeledPoint extends Point {
    String label;

    public LabeledPoint(double x, double y, String label) {
        super(x, y);
        this.label = label;
    }

    void method() {
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
    }
}
