package ch04;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Ex11HelloReflectiveWorld {
    public static void main(String[] args) throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Class<?> cls = System.class;
        Object out = cls.getField("out").get(null); // get System.out static field
        Method println = out.getClass().getMethod("println", String.class);
        println.invoke(out, "Hello Reflective World!");
    }
}
