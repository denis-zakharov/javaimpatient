package ch01;

public class Ex09StringComparison {
    public static void main(String[] args) {
        //String literals are the same objects in JVM
        System.out.println("Word" == "Word");
        System.out.println("word".equals("word"));
        String w1 = "word";
        String w2 = "word";
        System.out.println(w1 == w2);
        System.out.println(w1.equals(w2));

        //String objects
        String words = "word word";
        String[] wordsArray = words.split(" ");
        System.out.println(wordsArray[0] == wordsArray[1]); // false
        System.out.println(wordsArray[0].equals(wordsArray[1])); // true
    }
}
