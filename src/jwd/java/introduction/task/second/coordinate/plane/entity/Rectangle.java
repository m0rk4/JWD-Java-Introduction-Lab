package jwd.java.introduction.task.second.coordinate.plane.entity;

public class Rectangle {
    private final double x;
    private final double y;
    private final double width;
    private final double height;

    public Rectangle(Point point, double width, double height) {
        this.x = point.getX();
        this.y = point.getY();
        this.width = width;
        this.height = height;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
