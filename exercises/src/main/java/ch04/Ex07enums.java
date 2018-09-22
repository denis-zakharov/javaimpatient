package ch04;

enum  Rainbow {
    BLACK, RED, BLUE, GREEN, CYAN, MAGENTA, YELLOW, WHITE;
    Rainbow getGreen() {
        return GREEN;
    }
    static Rainbow getYellow() {
        return YELLOW;
    }
    static Rainbow getBlue() {
        return BLUE;
    }
}

public class Ex07enums {
    public static void main(String[] args) {
        Rainbow blue = Rainbow.getBlue();
        Rainbow green = Rainbow.BLACK.getGreen();
        System.out.println(blue);
        System.out.println(green);
    }
}
