package jwd.java.introduction.task.sixth.matrix;

import jwd.java.introduction.task.sixth.matrix.logic.ArrayTransformer;
import jwd.java.introduction.task.sixth.matrix.logic.impl.ShiftArrayTransformer;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        ArrayTransformer transformer = new ShiftArrayTransformer();
        int[][] result = transformer.transform(new int[]{1, 2, 3, 4, 5});
        for (int[] row : result) {
            LOGGER.log(Level.INFO, "{0}", Arrays.toString(row));
        }
    }
}
