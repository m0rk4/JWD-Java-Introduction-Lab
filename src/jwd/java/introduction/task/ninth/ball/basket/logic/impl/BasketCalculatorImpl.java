package jwd.java.introduction.task.ninth.ball.basket.logic.impl;

import jwd.java.introduction.task.ninth.ball.basket.entity.Ball;
import jwd.java.introduction.task.ninth.ball.basket.entity.Basket;
import jwd.java.introduction.task.ninth.ball.basket.logic.BasketCalculator;

import java.util.function.Predicate;

public class BasketCalculatorImpl implements BasketCalculator {
    @Override
    public int getTotalWeight(Basket basket) {
        return basket.getBalls().stream()
                .map(Ball::getWeight)
                .reduce(0, Integer::sum);
    }

    @Override
    public long getBallsCountByCondition(Basket basket, Predicate<Ball> predicate) {
        return basket.getBalls().stream()
                .filter(predicate)
                .count();
    }
}
