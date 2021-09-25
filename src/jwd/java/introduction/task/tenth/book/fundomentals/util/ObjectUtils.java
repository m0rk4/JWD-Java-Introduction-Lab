package jwd.java.introduction.task.tenth.book.fundomentals.util;

public class ObjectUtils {
    private ObjectUtils() {
    }

    /**
     * Null-safe object compare method.
     *
     * @param firstObject  First object to compare
     * @param secondObject Second object to compare
     * @param <T>          Object type
     * @return a negative integer, zero, or a positive integer as the first object is less than, equal to,
     * or greater than the second object.
     */
    public static <T extends Comparable<? super T>> int compare(T firstObject, T secondObject) {
        if (firstObject == secondObject) {
            return 0;
        }
        if (firstObject == null) {
            return -1;
        }
        if (secondObject == null) {
            return 1;
        }
        return firstObject.compareTo(secondObject);
    }
}
