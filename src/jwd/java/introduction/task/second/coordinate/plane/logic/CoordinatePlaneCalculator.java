package jwd.java.introduction.task.second.coordinate.plane.logic;

import jwd.java.introduction.task.second.coordinate.plane.entity.Point;
import jwd.java.introduction.task.second.coordinate.plane.entity.Rectangle;

public interface CoordinatePlaneCalculator {
    boolean isPointBelongToRectangle(Point point, Rectangle rectangle);
}
