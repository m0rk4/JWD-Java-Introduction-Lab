package jwd.java.introduction.task.second.coordinate.plane;

import jwd.java.introduction.task.second.coordinate.plane.entity.Point;
import jwd.java.introduction.task.second.coordinate.plane.entity.Rectangle;
import jwd.java.introduction.task.second.coordinate.plane.logic.CoordinatePlaneCalculator;
import jwd.java.introduction.task.second.coordinate.plane.logic.impl.CoordinatePlaneCalculatorImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle(new Point(-4, 5), 8, 5);
        Rectangle secondRectangle = new Rectangle(new Point(-6, 0), 12, 3);
        Point point = new Point(2, 2);

        CoordinatePlaneCalculator calculator = new CoordinatePlaneCalculatorImpl();
        boolean result = calculator.isPointBelongToRectangle(point, firstRectangle) ||
                calculator.isPointBelongToRectangle(point, secondRectangle);
        LOGGER.log(Level.INFO, "{0}", result);
    }
}
