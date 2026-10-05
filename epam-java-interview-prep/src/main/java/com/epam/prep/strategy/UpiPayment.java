package com.epam.prep.strategy;

public class UpiPayment implements PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("Paying amount: "+amount+" by UPOI");
    }
}
