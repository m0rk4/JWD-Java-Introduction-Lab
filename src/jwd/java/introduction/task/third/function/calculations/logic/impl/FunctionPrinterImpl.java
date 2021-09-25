package jwd.java.introduction.task.third.function.calculations.logic.impl;

import jwd.java.introduction.task.third.function.calculations.exception.FunctionPrinterException;
import jwd.java.introduction.task.third.function.calculations.logic.FunctionPrinter;

import java.util.function.DoubleUnaryOperator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FunctionPrinterImpl implements FunctionPrinter {
    private static final Logger LOGGER = Logger.getLogger(FunctionPrinterImpl.class.getName());

    @Override
    public void print(DoubleUnaryOperator function, double step, double start, double end) throws FunctionPrinterException {
        if (function == null) {
            throw new FunctionPrinterException("Function ius null.");
        }
        if (step < 0) {
            throw new FunctionPrinterException("Step is less than zero.");
        }
        if (end < start) {
            throw new FunctionPrinterException("End is less than start.");
        }

        while (start <= end) {
            double result = function.applyAsDouble(start);
            String message = String.format("%12.6f %12.6f", start, result);
            LOGGER.log(Level.INFO, message);
            start += step;
        }
    }
}
