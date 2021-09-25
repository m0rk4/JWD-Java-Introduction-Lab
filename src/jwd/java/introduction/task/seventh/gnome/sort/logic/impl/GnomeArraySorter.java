package jwd.java.introduction.task.seventh.gnome.sort.logic.impl;

import jwd.java.introduction.task.seventh.gnome.sort.logic.ArraySorter;

public class GnomeArraySorter<T extends Comparable<T>> implements ArraySorter<T> {
    @Override
    public void sort(T[] array) {
        int index = 0;
        while (index < array.length) {
            boolean shouldMoveForward = index == 0 || array[index].compareTo(array[index - 1]) >= 0;
            if (shouldMoveForward) {
                index++;
            } else {
                swap(array, index, index - 1);
                index--;
            }
        }
    }
}
