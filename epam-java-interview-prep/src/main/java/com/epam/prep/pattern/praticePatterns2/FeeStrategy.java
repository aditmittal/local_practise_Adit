package com.epam.prep.pattern.praticePatterns2;

@FunctionalInterface
public interface FeeStrategy {
    double calculate(double amount);
}
