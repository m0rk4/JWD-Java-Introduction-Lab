package jwd.java.introduction.task.second.coordinate.plane.logic.impl;

import jwd.java.introduction.task.second.coordinate.plane.entity.Point;
import jwd.java.introduction.task.second.coordinate.plane.entity.Rectangle;
import jwd.java.introduction.task.second.coordinate.plane.logic.CoordinatePlaneCalculator;

public class CoordinatePlaneCalculatorImpl implements CoordinatePlaneCalculator {
    @Override
    public boolean isPointBelongToRectangle(Point point, Rectangle rectangle) {
        boolean isBetweenX = point.getX() <= rectangle.getX() + rectangle.getWidth() && point.getX() >= rectangle.getX();
        boolean isBetweenY = point.getY() <= rectangle.getY() + rectangle.getHeight() && point.getY() >= rectangle.getY();
        return isBetweenX && isBetweenY;
    }
}
