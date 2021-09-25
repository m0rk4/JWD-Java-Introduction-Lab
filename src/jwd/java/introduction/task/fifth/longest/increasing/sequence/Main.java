package jwd.java.introduction.task.fifth.longest.increasing.sequence;

import jwd.java.introduction.task.fifth.longest.increasing.sequence.logic.LongestIncreasingSequenceCalculator;
import jwd.java.introduction.task.fifth.longest.increasing.sequence.logic.impl.LongestIncreasingSequenceCalculatorImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LongestIncreasingSequenceCalculator calculator = new LongestIncreasingSequenceCalculatorImpl();
        int result = calculator.getLowestCountForLongestIncreasingSequence(new int[]{1, 6, 3, 4, 5, 6});
        LOGGER.log(Level.INFO, "{0}", result);
    }
}
