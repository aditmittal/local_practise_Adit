package com.epam.prep.pattern.factoryPayment;

public class CreditPayment implements Payment{
    @Override
    public void pay(String msg){
        System.out.println(msg+" PAYING VIA CREDIT CARD");
    }
}
