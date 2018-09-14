package ch01;

public class Ex11CodePoints {
    public static void main(String[] args) {
        String s = "Строка с не ASCII символами. Hello, 世界!";
        int[] codePoints = s.codePoints().toArray();
        StringBuilder sb = new StringBuilder();
        for (int codePoint : codePoints) {
            if (codePoint > 127) { // non-ascii
                sb.appendCodePoint(codePoint);
            }
        }
        System.out.println(sb);
    }
}
