package com.epam.prep.pattern;

@FunctionalInterface
public interface FeeStrategy {
    double calculate(double amount);
}
