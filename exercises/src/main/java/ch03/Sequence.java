package ch03;

import java.util.NoSuchElementException;

public interface Sequence<T> {
    default boolean hasNext() {
        return true;
    }

    T next();
}
