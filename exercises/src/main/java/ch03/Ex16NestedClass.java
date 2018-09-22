package ch03;

import java.util.Random;

class LocalClassDemo {
    private static Random generator = new Random();

    private static class RandomSequence implements IntSequence {
        int low;
        int high;

        RandomSequence(int low, int high) {
            this.low = low;
            this.high = high;
        }

        public int next() {
            return low + generator.nextInt(high - low + 1);
        }

        public boolean hasNext() {
            return true;
        }
    }

    static IntSequence randomInts(int low, int high) {
        return new RandomSequence(low, high);
    }
}


public class Ex16NestedClass {
    public static void main(String[] args) {

        IntSequence dieTosses = LocalClassDemo.randomInts(1, 6);
        for (int i = 0; i < 10; i++) {
            System.out.println(dieTosses.next());
        }
    }
}
