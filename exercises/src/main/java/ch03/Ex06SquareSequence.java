package ch03;

import java.math.BigInteger;
import java.util.NoSuchElementException;

class SquareSequence implements Sequence<BigInteger> {
    private BigInteger i = BigInteger.ZERO;

    @Override
    public BigInteger next() throws NoSuchElementException {
        i = i.add(BigInteger.ONE);
        return i.multiply(i);
    }
}

public class Ex06SquareSequence {
    public static void main(String[] args) {
        Sequence<BigInteger> squareSequence = new SquareSequence();
        for (int i = 0; i < 10; i++) {
            System.out.println(squareSequence.next());
        }
        System.out.println(squareSequence.hasNext());
    }
}
