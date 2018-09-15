package ch01;

import java.util.ArrayList;

public class Ex15PascalTriangle {
    public static void main(String[] args) {
        System.out.println(triangleRow(3));
        System.out.println(triangleRow(5));
        System.out.println(triangleRow(7));
    }

    private static ArrayList<Integer> triangleRow(int n) {
        if (n == 0) return new ArrayList<>();
        else if (n == 1) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            return row;
        }
        else if (n == 2) {
            ArrayList<Integer> row = new ArrayList<>();
            row.add(1);
            row.add(1);
            return row;
        }
        else {
            ArrayList<Integer> prevRow = triangleRow(n - 1);
            ArrayList<Integer> row = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                if (i == 0 || i == n - 1) {
                    row.add(1);
                } else {
                    row.add(prevRow.get(i - 1) + prevRow.get(i));
                }
            }
            return row;
        }
    }
}
