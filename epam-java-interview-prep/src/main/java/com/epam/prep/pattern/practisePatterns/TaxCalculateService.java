package com.epam.prep.pattern.practisePatterns;

import java.util.Map;

public class TaxCalculateService {
    Map<salType, CalculateTax> STRATEGY =
            Map.of(
                    salType.BUSINESS, amount -> amount *0.2,
                    salType.COPERATE, amount -> amount*0.3,
                    salType.INDIVIDUAL, amount -> amount*0.1
            );

    public double calculateTax(salType type, double amount){
        CalculateTax taxCalc = STRATEGY.get(type);
        return taxCalc.tax(amount);
    }
}
