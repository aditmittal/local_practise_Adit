package com.epam.prep.pattern.StrategyPattern;

import java.util.Map;

public class FeeCalculateService {
    private static final Map<AccountType, FeeStrategy>STRATEGIES =
            Map.of(
                    AccountType.SAVINGS, amount -> amount*0.01,
                    AccountType.CURRENT, amount -> amount*0.02,
                    AccountType.PREMIUM, amount -> amount*0.005
            );

    public double calculateFee(AccountType typr, double amount){
        FeeStrategy strategy = STRATEGIES.get(typr);
        if(strategy == null){
            throw new IllegalArgumentException("no startegy found");
        }
        return strategy.calculate(amount);
    }
}
