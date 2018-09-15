package ch01;

public class Ex16Avg {
    public static void main(String[] args) {
        System.out.println(average(1));
        System.out.println(average(1, 2, 3));
        System.out.println(average(0));
    }

    private static double average(double i, double... rest) {
        double sum = 0;
        for (double v : rest) sum += v;
        return (sum + i) / (rest.length + 1);
    }
}
