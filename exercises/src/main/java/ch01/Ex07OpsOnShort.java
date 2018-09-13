package ch01;

import java.util.Scanner;

public class Ex07OpsOnShort {
    // TODO Make this operations correct as if the numbers are unsigned short
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input two integer numbers between 0 and 65535: ");
        int n1 = scanner.nextInt();
        int n2 = scanner.nextInt();
        // 16 bit
        short a = (short) n1;
        short b = (short) n2;

        System.out.println("Sum: " + (a + b));
        System.out.println("Diff: " + (a - b));
        System.out.println("Mult: " + (a * b));
        System.out.println("Mod: " + (a % b));
    }
}
