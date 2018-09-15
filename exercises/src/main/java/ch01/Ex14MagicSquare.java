package ch01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14MagicSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Square size: ");
        int size = sc.nextInt();
        int[][] square = new int[size][size];
        for (int i = 0; i < size; ++i) {
            for (int k = 0; k < size; ++k) {
                square[i][k] = sc.nextInt();
            }
        }

        if (checkSqaure(square)) System.out.println("It's magic!");
        else System.out.println("It is not magic :-( Try harder!");
    }

    static boolean checkSqaure(int[][] magicSquare) {
        long ethalon = arraySum(magicSquare[0]);
        // check rows
        for (int i = 1; i < magicSquare.length; ++i) {
            if (arraySum(magicSquare[i]) != ethalon) return false;
        }
        // check columns
        for (int i = 0; i < magicSquare.length; ++i) {
            long columnSum = 0;
            for (int k = 0; k < magicSquare.length; ++k) {
                columnSum += magicSquare[k][i];
            }
            if (columnSum != ethalon) return false;
        }
        return true;
    }

    static long arraySum(int[] array) {
        long sum = 0L;
        for (int i = 0; i < array.length; ++i) {
            sum += array[i];
        }
        return sum;
    }
}
