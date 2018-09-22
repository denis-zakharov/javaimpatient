package ch04.point;

public class AccessPoint {
    public static void main(String[] args) {
        // can access protected field outside of a class because AccessPoint is in the same package
        System.out.println(new Point(5, 6).x);
    }
}
