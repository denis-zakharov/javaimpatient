package ch01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Ex13Lottery {
    public static void main(String[] args) {
        ArrayList<Integer> lotteryBalls = new ArrayList<>();
        for (int i = 0; i < 49; ++i) {
            lotteryBalls.add(i + 1);
        }

        int[] ticket = new int[6];

        Random randomGen = new Random();
        for (int i = 0; i < 6; ++i) {
            int randomIndex = randomGen.nextInt(49);
            int ball = lotteryBalls.remove(randomIndex);
            ticket[i] = ball;
        }

        Arrays.sort(ticket);
        System.out.println(Arrays.toString(ticket));
    }
}
