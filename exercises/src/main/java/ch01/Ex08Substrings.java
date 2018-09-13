package ch01;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08Substrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a string: ");
        String str = scanner.next();
        for (int i = 0; i < str.length(); ++i) {
            for (int j = 0; j <= str.length(); ++j) {
                if (j > i) System.out.println(str.substring(i, j));
            }
        }

    }
}
