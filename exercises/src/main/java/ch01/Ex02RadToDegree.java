package ch01;

import java.util.Scanner;

class Radian {
    private int rad;

    Radian(int rad) {
        this.rad = rad;
    }

    double toDegrees() {
        return ((rad * 180 / Math.PI) % 360 + 360) % 360;
    }

    double toDegreesMath() {
        return Math.floorMod(Math.round(rad * 180 / Math.PI), 360);
    }
}

public class Ex02RadToDegree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input radian: ");
        int num = scanner.nextInt();
        System.out.println("Convert to degrees (0 - 359)");
        Radian rad = new Radian(num);
        System.out.println(rad.toDegrees());
        System.out.println(rad.toDegreesMath());
    }
}

