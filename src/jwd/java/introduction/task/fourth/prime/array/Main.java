package jwd.java.introduction.task.fourth.prime.array;

import jwd.java.introduction.task.fourth.prime.array.logic.PrimeArrayCalculator;
import jwd.java.introduction.task.fourth.prime.array.logic.impl.PrimeArrayCalculatorImpl;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        PrimeArrayCalculator calculator = new PrimeArrayCalculatorImpl();
        List<Integer> primeIndexes = calculator.getArrayPrimeIndexes(new int[]{1, 2, 3, 4, 17});
        LOGGER.log(Level.INFO, "{0}", primeIndexes);
    }
}
