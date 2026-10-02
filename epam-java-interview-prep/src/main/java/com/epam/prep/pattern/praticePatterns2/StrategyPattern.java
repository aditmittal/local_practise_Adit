package com.epam.prep.pattern.praticePatterns2;

public class StrategyPattern {
    public static void main(String[] args){
        FeeCalculateService service = new FeeCalculateService();

        System.out.println(service.calculateFee(AccountType.SAVINGS, 10000));

        System.out.println(service.calculateFee(AccountType.CURRENT, 10000));

        System.out.println(service.calculateFee(AccountType.PREMIUM, 10000));

    }
}
