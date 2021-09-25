package jwd.java.introduction.task.ninth.ball.basket;

import jwd.java.introduction.task.ninth.ball.basket.entity.Ball;
import jwd.java.introduction.task.ninth.ball.basket.entity.Basket;
import jwd.java.introduction.task.ninth.ball.basket.entity.Color;
import jwd.java.introduction.task.ninth.ball.basket.logic.BasketCalculator;
import jwd.java.introduction.task.ninth.ball.basket.logic.impl.BasketCalculatorImpl;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static final Logger LOGGER = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        BasketCalculator calculator = new BasketCalculatorImpl();
        Basket basket = new Basket(
                new Ball(50, Color.BLUE),
                new Ball(100, Color.OTHER),
                new Ball(150, Color.OTHER),
                new Ball(200, Color.BLUE)
        );
        int totalWeight = calculator.getTotalWeight(basket);
        long blueBallsCount = calculator.getBallsCountByCondition(basket, ball -> ball.getColor() == Color.BLUE);
        LOGGER.log(Level.INFO, "Balls in basket: {0}\n", basket.getBalls());
        LOGGER.log(Level.INFO, "Total balls weight: {0}\n", totalWeight);
        LOGGER.log(Level.INFO, "Blue balls count: {0}", blueBallsCount);
    }
}
