package ch04;

import ch02.point.Point;

import java.util.ArrayList;

public class Ex08ClassName {
    static class Nested {
    }

    static void printClassRepr(Object obj, String header) {
        Class<?> cls = obj.getClass();
        printClassObjectRepr(cls, header);
    }

    private static void printClassObjectRepr(Class<?> cls, String header) {
        System.out.println("---" + header + "---");
        System.out.println("getName: " + cls.getName());
        System.out.println("getCanonicalName: " + cls.getCanonicalName());
        System.out.println("getPackageName: " + cls.getPackageName());
        System.out.println("getSimpleName: " + cls.getSimpleName());
        System.out.println("getTypeName: " + cls.getTypeName());
        System.out.println("getGenericString: " + cls.toGenericString());
        System.out.println("toString: " + cls.toString());
        System.out.println();
    }

    public static void main(String[] args) {
        String str = "word";
        Nested nested = new Nested();
        Point point = new Point(1, 2);
        Point[] points = {new Point(1, 2), new Point(3, 4)};
        ArrayList<Point> pointList = new ArrayList<>();
        pointList.add(new Point(1, 2));
        pointList.add(new Point(3, 4));

        printClassRepr(str, "String class");
        printClassRepr(nested, "Static nested class");
        printClassRepr(point, "Regular class");
        printClassRepr(points, "Array of regular class");
        printClassRepr(pointList, "ArrayList of Points");
        printClassObjectRepr(int.class, "int.class");
    }
}
