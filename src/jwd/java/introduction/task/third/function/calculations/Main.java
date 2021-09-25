package jwd.java.introduction.task.third.function.calculations;

import jwd.java.introduction.task.third.function.calculations.exception.FunctionPrinterException;
import jwd.java.introduction.task.third.function.calculations.logic.FunctionPrinter;
import jwd.java.introduction.task.third.function.calculations.logic.impl.FunctionPrinterImpl;

public class Main {
    public static void main(String[] args) throws FunctionPrinterException {
        FunctionPrinter printer = new FunctionPrinterImpl();
        printer.print(Math::tan, Math.PI, 0, 2 * Math.PI);
    }
}
