package ch04;

import ch02.point.Point;

import java.lang.reflect.Field;

public class Ex09ToString {
    private static String toStringUniversal(Class<?> cls, Object obj) throws IllegalAccessException {
        Field[] fields = cls.getDeclaredFields(); // including private ones
        StringBuilder fieldsString = new StringBuilder();
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            field.setAccessible(true);
            Object value = field.get(obj);
            fieldsString.append(field.getName()).append("=").append(value);
            if (i < fields.length - 1) fieldsString.append(", ");
        }
        return cls.getCanonicalName() + '{' + fieldsString.toString() + '}';
    }

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(toStringUniversal(Point.class, new Point(3, 4)));
    }
}
