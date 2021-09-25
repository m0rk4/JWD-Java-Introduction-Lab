package jwd.java.introduction.task.seventh.gnome.sort;

import jwd.java.introduction.task.seventh.gnome.sort.logic.ArraySorter;
import jwd.java.introduction.task.seventh.gnome.sort.logic.impl.GnomeArraySorter;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ArraySorter<Integer> sorter = new GnomeArraySorter<>();
        Integer[] array = {1, 3, 4, 32, 535, 111, 4, 5, 6};
        sorter.sort(array);
        LOGGER.log(Level.INFO, "{0}", Arrays.toString(array));
    }
}
