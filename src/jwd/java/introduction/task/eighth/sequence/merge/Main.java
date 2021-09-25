package jwd.java.introduction.task.eighth.sequence.merge;

import jwd.java.introduction.task.eighth.sequence.merge.logic.SequenceMerger;
import jwd.java.introduction.task.eighth.sequence.merge.logic.impl.SequenceMergerImpl;

import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        SequenceMerger merger = new SequenceMergerImpl();
        int[] result = merger.getInsertIndexesForMergedSequence(
                new int[]{1, 5, 8, 9},
                new int[]{0, 6, 8, 20}
        );
        LOGGER.log(Level.INFO, "{0}", Arrays.toString(result));
    }
}
