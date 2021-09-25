package jwd.java.introduction.task.fifth.longest.increasing.sequence.logic.impl;

import jwd.java.introduction.task.fifth.longest.increasing.sequence.logic.LongestIncreasingSequenceCalculator;

public class LongestIncreasingSequenceCalculatorImpl implements LongestIncreasingSequenceCalculator {
    @Override
    public int getLowestCountForLongestIncreasingSequence(int[] sequence) {
        int[] dynamicSequence = getLongestIncreasingSequenceLengthArray(sequence);
        int maximumLength = dynamicSequence[0];
        for (int item : dynamicSequence) {
            maximumLength = Math.max(maximumLength, item);
        }
        return sequence.length - maximumLength;
    }

    private int[] getLongestIncreasingSequenceLengthArray(int[] sequence) {
        int length = sequence.length;
        int[] dSequence = new int[length];
        for (int i = 0; i < length; i++) {
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
