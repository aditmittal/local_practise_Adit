package com.epam.prep.pattern.factoryPayment;

public class MainClass {
    public static void main(String[] args){
        Payment payment = PaymentFactory.createPayment("upi");
        payment.pay("payment do");

        Payment paydupe = PaymentFactory.createPayment("bhag");
        paydupe.pay("10000 rs");
    }
}
