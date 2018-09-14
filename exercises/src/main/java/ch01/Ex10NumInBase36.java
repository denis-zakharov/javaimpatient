package ch01;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Ex10NumInBase36 {
    public static void main(String[] args) {
        Random random = new Random(42);
        long randomNum = random.nextLong();
        long num = 7562;
        System.out.println(num);
        System.out.println(toBase(num, 16));
        System.out.println(toBase(num, 36));
        System.out.println();
        System.out.println(toBase(randomNum, 16));
        System.out.println(toBase(randomNum, 36));

    }

    static String toBase(long num, int base) {
        List<Long> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        if (num < 0) {
            sb.append('-');
            num = -num;
        }
        do {
            long reminder = num % base;
            num /= base; // quotient
            result.add(reminder);
        } while (num != 0); // quotient
        Collections.reverse(result);
        //System.out.println(result);

        for (long n : result) {
            if (n>9) sb.append((char) (87 + n));
            else sb.append((char) (48 + n));
        }
        return sb.toString();
    }
}
