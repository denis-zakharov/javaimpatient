package ch02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//Ex10
public class RandomNumbers {
    private static Random generator = new Random();

    public static int nextInt(int low, int high) {
        return low + generator.nextInt(high - low + 1);
        // Ok to access the static generator variable
    }

    public static int randomElement(int... array) {
        if (array.length == 0) return 0;
        return array[nextInt(0, array.length - 1)];
    }

    public static int randomElement(List<Integer> intList) {
        if (intList.isEmpty()) return 0;
        return intList.get(nextInt(0, intList.size() - 1));
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
        for (int i = 0; i <= list.size(); i++) System.out.println(randomElement(list));
    }
}