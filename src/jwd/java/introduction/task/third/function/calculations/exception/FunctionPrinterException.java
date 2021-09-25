package jwd.java.introduction.task.third.function.calculations.exception;

public class FunctionPrinterException extends Exception {
    public FunctionPrinterException(String message, Throwable cause) {
        super(message, cause);
    }

    public FunctionPrinterException(String message) {
        super(message);
    }
}
