package com.epam.prep.pattern.factoryPayment;

public class DebitPayment implements Payment{
    @Override
    public void pay(String msg){
        System.out.println(msg+" PAYING VIA DEBIT CARD");
    }
}
