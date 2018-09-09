package ch01;

import java.util.Scanner;

public class Ex03MaxOfThree {
    private static int maxOfThree(int a, int b, int c) {
        if (a >= b && a >= c) return a;
        else if (b >= a && b >= c) return b;
        else return c;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input three numbers: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt(10); // decimal base (radix) is default
        System.out.println(maxOfThree(num1, num2, num3));
        System.out.println(Math.max(Math.max(num1, num2), num3));
    }
}
