package jwd.java.introduction.task.fifth.lis.logic.impl;

import jwd.java.introduction.task.fifth.lis.logic.LongestIncreasingSequenceCalculator;

public class LongestIncreasingSequenceCalculatorImpl implements LongestIncreasingSequenceCalculator {
    @Override
    public int getLowestCountForLongestIncreasingSequence(int[] sequence) {
        int[] dSequence = getLISLengthArray(sequence);
        int len = dSequence[0];
        for (int item : dSequence) {
            len = Math.max(len, item);
        }
        return sequence.length - len;
    }

    private int[] getLISLengthArray(int[] sequence) {
        int[] dSequence = new int[sequence.length];
        for (int i = 0; i < sequence.length; i++) {
            dSequence[i] = 1;
            for (int j = 0; j < i; j++) {
                if (sequence[j] < sequence[i]) {
                    dSequence[i] = Math.max(dSequence[i], 1 + dSequence[j]);
                }
            }
        }
        return dSequence;
    }
}
