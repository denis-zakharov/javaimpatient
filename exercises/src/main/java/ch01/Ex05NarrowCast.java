package ch01;

public class Ex05NarrowCast {
    // TODO make narrowing conversion manually
    public static void main(String[] args) {
        int narrow = (int) Double.MAX_VALUE;
        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Narrowing cast to int: " + narrow);

        System.out.println(Integer.MAX_VALUE);
        int narrow2 = (int) Math.pow(2, 32) / 2; // max int + 1
        System.out.println(narrow2);
    }
}
