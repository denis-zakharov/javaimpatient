package ch01;

public class Ex07OpsOnShort {
    public static void main(String[] args) {
        //Short.MAX_VALUE 32767
        short a = (short) 40000;
        short b = 10000;

        short c = 1000;
        short d = 60;

        short sum = (short) (a + b);
        short diff = (short) (a - b);
        short mult = (short) (c * d);
        System.out.println("Sum: " + Short.toUnsignedInt(sum));
        System.out.println("Diff: " + Short.toUnsignedInt(diff));
        System.out.println("Mult: " + Short.toUnsignedInt(mult));
        System.out.println("Div: " + Integer.divideUnsigned(sum, 2));
        System.out.println("Mod: " + Integer.remainderUnsigned(sum, 3));
    }
}
