package ch03;

public class Ex04IntSeq {
    public static void main(String[] args) {
        IntSequence intSequence = IntSequence.of(3, 1, 4, 1, 5, 9);
        System.out.println(intSequence.next());
        System.out.println(intSequence.next());

        IntSequence infSeq = IntSequence.constant(42);
        System.out.println(infSeq.next());
        System.out.println(infSeq.next());
        System.out.println(infSeq.next());

        IntSequence infSeqLambda = IntSequence.constantLambda(24);
        System.out.println(infSeqLambda.next());
        System.out.println(infSeqLambda.next());
        System.out.println(infSeqLambda.next());
    }
}
