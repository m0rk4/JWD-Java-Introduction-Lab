package jwd.java.introduction.task.sixth.matrix.logic.impl;

import jwd.java.introduction.task.sixth.matrix.logic.ArrayTransformer;

public class ShiftArrayTransformer implements ArrayTransformer {
    @Override
    public int[][] transform(int[] array) {
        int length = array.length;
        int[][] transformedMatrix = new int[length][length];
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                int index = (j + i) % length;
                transformedMatrix[i][j] = array[index];
            }
        }
        return transformedMatrix;
    }
}
