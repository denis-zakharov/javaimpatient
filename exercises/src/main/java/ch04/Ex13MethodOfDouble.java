package ch04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.function.DoubleFunction;

public class Ex13MethodOfDouble {
    public static void doubleMethod(Method method, double low, double high, double step) throws InvocationTargetException, IllegalAccessException {
        for (double i = low; i < high; i += step) {
            System.out.println(method.invoke(null, i));
        }
    }

    public static void doubleMethod2(DoubleFunction<Object> doubleFunction, double low, double high, double step) {
        for (double i = low; i < high; i += step) {
            System.out.println(doubleFunction.apply(i));
        }
    }

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        long start = System.nanoTime();
        doubleMethod(Math.class.getMethod("sqrt", double.class), 1, 10000, 2);
        doubleMethod(Double.class.getMethod("toHexString", double.class), 1, 10000, 2);
        long end = System.nanoTime();
        double reflection = (double) (end - start) / 1000000000.0;
        start = System.nanoTime();
        doubleMethod2(Math::sqrt, 1, 10000, 2);
        doubleMethod2(Double::toHexString, 1, 10000, 2);
        end = System.nanoTime();
        double inv = (double) (end - start) / 1000000000.0;

        System.out.println("Reflection seconds: " + reflection);
        System.out.println("Invocation seconds: " + inv);

        System.out.println("Faster in " + (reflection / inv));
    }
}
