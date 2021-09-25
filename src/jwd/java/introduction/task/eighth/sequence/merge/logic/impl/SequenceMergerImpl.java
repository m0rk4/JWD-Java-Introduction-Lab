package jwd.java.introduction.task.eighth.sequence.merge.logic.impl;

import jwd.java.introduction.task.eighth.sequence.merge.logic.SequenceMerger;

public class SequenceMergerImpl implements SequenceMerger {
    @Override
    public int[] getInsertIndexesForMergedSequence(int[] firstSequence, int[] secondSequence) {
        int firstSequenceLength = firstSequence.length;
        int secondSequenceLength = secondSequence.length;
        int i = 0;
        int j = 0;
        int k = 0;
        int[] insertIndexes = new int[secondSequenceLength];
        while (i < firstSequenceLength && j < secondSequenceLength) {
            if (firstSequence[i] <= secondSequence[j]) {
                i++;
            } else {
                insertIndexes[j++] = k;
            }
            k++;
        }
        while (j < secondSequenceLength) {
            insertIndexes[j++] = k;
            k++;
        }
        return insertIndexes;
    }
}
