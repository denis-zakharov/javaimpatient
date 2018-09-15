package ch01;

import java.util.Arrays;

class Ex12 {

    private static final Object[] es = {null, "String", 1.0};

    public boolean removeLabeled(Object o) {
        int size = es.length;
        int i = 0;
        found: {
            if (o == null) {
                for (; i < size; i++)
                    if (es[i] == null)
                        break found;
            } else {
                for (; i < size; i++)
                    if (o.equals(es[i]))
                        break found;
            }
            return false;
        }
        fastRemove(es, i);
        return true;
    }

    public boolean remove(Object o) {
        int size = es.length;
        int i = 0;
        boolean found = false;
        for (; i < size; i++) {
            if (o == null && es[i] == null) {
                found = true;
                break;
            } else if (o.equals(es[i])) {
                found = true;
                break;
            }
        }
        if (found) {
            fastRemove(es, i);
            return found;
        }
        return found;
    }

    private void fastRemove(Object[] es, int i) {
        System.out.println("Removing " + i + " index from " + Arrays.toString(es));
    }
}

public class Ex12LabeledBreakRewrite {
    public static void main(String[] args) {
        Ex12 ex12 = new Ex12();
        // pseudo remove
        System.out.println(ex12.remove(null));
        System.out.println(ex12.removeLabeled(null));
        System.out.println(ex12.remove("String"));
        System.out.println(ex12.removeLabeled("String"));
        System.out.println(ex12.remove("Not exists"));
        System.out.println(ex12.removeLabeled("Not exists"));
    }
}