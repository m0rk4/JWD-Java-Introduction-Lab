package jwd.java.introduction.task.fourth.prime.array.logic.impl;

import jwd.java.introduction.task.fourth.prime.array.logic.PrimeArrayCalculator;
import jwd.java.introduction.task.fourth.prime.array.util.PrimeUtils;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrimeArrayCalculatorImpl implements PrimeArrayCalculator {
    @Override
    public List<Integer> getArrayPrimeIndexes(int[] array) {
        return IntStream.range(0, array.length)
                .filter(i -> PrimeUtils.isPrime(array[i]))
                .boxed()
                .collect(Collectors.toList());
    }
}
