package ch03;

import java.util.*;

public class Ex08LuckySort {
    static <T> boolean isOrdered(Iterable<T> list, Comparator<? super T> c) {
        Iterator<T> i = list.iterator();
        if (i.hasNext()) {
            T previous = i.next();
            while (i.hasNext()) {
                T current = i.next();
                if (c.compare(previous, current) > 0)
                    return false;
                previous = current;
            }
        }
        return true;
    }

    static void luckySort(List<String> strings, Comparator<String> comp) {
        while (!isOrdered(strings, comp)) {
            Collections.shuffle(strings);
        }
    }

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(Arrays.asList("it", "is", "a string"));
        System.out.println(strings);
        luckySort(strings, Comparator.naturalOrder());
        System.out.println(strings);
    }
}
