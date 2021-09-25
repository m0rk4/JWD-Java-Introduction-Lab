package jwd.java.introduction.task.first.math.calculations.logic.impl;

import jwd.java.introduction.task.first.math.calculations.logic.FormulaCalculator;

public class FormulaCalculatorImpl implements FormulaCalculator {
    @Override
    public double calculate(double x, double y) {
        double numerator = getNumerator(x, y);
        double denominator = getDenominator(x, y);
        return numerator / denominator + x;
    }

    private double getNumerator(double x, double y) {
        double sum = x + y;
        double sin = Math.sin(sum);
        return 1.0 + sin * sin;
    }

    private double getDenominator(double x, double y) {
        double product = x * y;
        double productSquared = product * product;
        double factor = (productSquared - 1.0) / (productSquared + 1.0);
        return 2.0 + Math.abs(x * factor);
    }
}
