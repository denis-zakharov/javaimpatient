package ch01;

public class Ex05NarrowCast {
    public static void main(String[] args) {
        int narrow = (int) Double.MAX_VALUE;
        System.out.println("Max double: " + Double.MAX_VALUE);
        System.out.println("Narrowing cast to int: " + narrow);

        System.out.println("Max int: " + Integer.MAX_VALUE);
        System.out.println("2^31: " + Math.pow(2, 31));
        int narrow2 = (int) Math.pow(2, 31); // max int + 1
        System.out.println("Narrowing case 2^31 to int: " + narrow2);
    }
}

/*
Max double: 1.7976931348623157E308
Narrowing cast to int: 2147483647
Max int: 2147483647
2^31: 2.147483648E9
Narrowing case 2^31 to int: 2147483647

Thus, cast of double > Integer.MAX_VALUE to int gives Integer.MAX_VALUE
 */