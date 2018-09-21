package ch03;

import java.util.NoSuchElementException;

public interface IntSequence {
    default boolean hasNext() {
        return true;
    }

    ;

    int next() throws NoSuchElementException;

    static IntSequence of(int... args) {
        return new IntSequence() {
            int current = 0;

            @Override
            public boolean hasNext() {
                return current < args.length;
            }

            @Override
            public int next() {
                if (hasNext()) {
                    int result = args[current];
                    if (current < args.length - 1) current++;
                    return result;
                }
                throw new NoSuchElementException();
            }
        };
    }

    static IntSequence constant(int c) {
        return new IntSequence() {
            @Override
            public int next() throws NoSuchElementException {
                return c;
            }
        };
    }

    static IntSequence constantLambda(final int c) {
        return () -> c;
    }
}
