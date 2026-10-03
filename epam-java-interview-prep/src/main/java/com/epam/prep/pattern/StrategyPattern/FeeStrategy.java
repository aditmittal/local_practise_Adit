package com.epam.prep.pattern.StrategyPattern;

@FunctionalInterface
public interface FeeStrategy {
    double calculate(double amount);
}
