package jwd.java.introduction.task.ninth.ball.basket.entity;

import java.util.List;

public class Basket {
    private final List<Ball> balls;

    public Basket(Ball... balls) {
        this.balls = List.of(balls);
    }

    public List<Ball> getBalls() {
        return balls;
    }
}
