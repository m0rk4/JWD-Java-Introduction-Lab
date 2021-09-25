package jwd.java.introduction.task.ninth.ball.basket.logic;

import jwd.java.introduction.task.ninth.ball.basket.entity.Ball;
import jwd.java.introduction.task.ninth.ball.basket.entity.Basket;

import java.util.function.Predicate;

public interface BasketCalculator {
    int getTotalWeight(Basket basket);

    long getBallsCountByCondition(Basket basket, Predicate<Ball> predicate);
}
