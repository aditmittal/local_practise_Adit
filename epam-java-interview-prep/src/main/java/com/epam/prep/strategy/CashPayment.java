package com.epam.prep.strategy;

public class CashPayment implements  PaymentStrategy{
    @Override
    public void pay(double amount){
        System.out.println("Paying amount: "+amount+" by CASH");
    }
}
