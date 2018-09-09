package ch01;

import java.math.BigInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ex06Factorial {
    private static long factorial(int n) {
        long result = 1;
        while (n > 1) {
            result *= n;
            --n;
        }
        return result;
    }

    private static BigInteger factorialBigInt(int n) {
        return Stream.iterate(BigInteger.ONE, x -> x.add(BigInteger.ONE)).limit(n) // short-circuit termination
                .reduce(BigInteger.ONE, BigInteger::multiply);
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
        System.out.println(factorialBigInt(10));
        System.out.println(factorialBigInt(1000));
        System.out.println(factorialBigInt(0));
        System.out.println(factorialBigInt(1));
    }
}
