package jwd.java.introduction.task.first.math.calculations;

import jwd.java.introduction.task.first.math.calculations.logic.FormulaCalculator;
import jwd.java.introduction.task.first.math.calculations.logic.impl.FormulaCalculatorImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        FormulaCalculator calculator = new FormulaCalculatorImpl();
        double result = calculator.calculate(1.5, 2.0);
        LOGGER.log(Level.INFO, "{0}", result);
    }
}
