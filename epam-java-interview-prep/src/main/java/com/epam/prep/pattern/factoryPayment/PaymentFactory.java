package com.epam.prep.pattern.factoryPayment;

public class PaymentFactory {
    public static Payment createPayment(String type){
        if(type.equalsIgnoreCase("upi")){
            return new UPIPayment();
        }
        else if(type.equalsIgnoreCase("credit")){
            return new CreditPayment();
        }
        else if(type.equalsIgnoreCase("debit")){
            return new DebitPayment();
        }
        throw new IllegalArgumentException(
                "payment methid not found"
        );
    }
}
