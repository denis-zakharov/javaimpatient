package ch02;

class IntHolder {
    private int value;

    IntHolder(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }

    void setValue(int value) {
        this.value = value;
    }
}

public class Ex04IntSwap {
    private static void swapIntsWrong(int x, int y) {
        int temp = x;
        x = y;
        y = temp;
    }

    private static void swapInts(IntHolder x, IntHolder y) {
        int temp = x.getValue();
        x.setValue(y.getValue());
        y.setValue(temp);
    }

    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        swapIntsWrong(x, y);
        System.out.println(x + " " + y);

        IntHolder xHolder = new IntHolder(x);
        IntHolder yHolder = new IntHolder(y);
        swapInts(xHolder, yHolder);
        System.out.println(xHolder.getValue() + " " + yHolder.getValue());
    }
}
