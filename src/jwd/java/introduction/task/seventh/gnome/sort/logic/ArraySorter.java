package jwd.java.introduction.task.seventh.gnome.sort.logic;

public interface ArraySorter<T extends Comparable<T>> {
    void sort(T[] array);

    default void swap(T[] array, int firstIndex, int secondIndex) {
        T item = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = item;
    }
}
