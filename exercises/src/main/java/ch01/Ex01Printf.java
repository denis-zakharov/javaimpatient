package ch01;

import java.util.Scanner;

public class Ex01Printf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input an integer number: ");
        int num = scanner.nextInt();
        System.out.printf("0b%s %#o %<#x", Integer.toBinaryString(num), num);
        System.out.println();
        System.out.printf("Reciprocal in hex floating: %#a", 1.0 / num);
    }
}
