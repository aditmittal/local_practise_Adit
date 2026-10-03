package com.epam.prep.pattern.predicate;

import java.util.function.Predicate;

public class Applicant {
    private double salary;
    private int creditScore;
    private String name;

    public Applicant(double salary, int creditScore, String name) {
        this.salary = salary;
        this.creditScore = creditScore;
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public int getCreditScore() {
        return creditScore;
    }

    public String getName() {
        return name;
    }

}
