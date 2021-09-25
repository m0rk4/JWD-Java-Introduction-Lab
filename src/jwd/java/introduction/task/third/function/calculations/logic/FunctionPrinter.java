package jwd.java.introduction.task.third.function.calculations.logic;

import jwd.java.introduction.task.third.function.calculations.exception.FunctionPrinterException;

import java.util.function.DoubleUnaryOperator;

public interface FunctionPrinter {
    void print(DoubleUnaryOperator function, double step, double start, double end) throws FunctionPrinterException;
}
