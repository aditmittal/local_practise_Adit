package com.epam.prep.strategy;

public class PaymentService {
    private PaymentStrategy paymentStrategy;

    public PaymentService(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(Double amount){
        paymentStrategy.pay(amount);
    }

    public static void main(String[] args){
        PaymentStrategy paymentStrategy = new UpiPayment();

        PaymentStrategy paymentStrategy1 = new CashPayment();

        PaymentService service = new PaymentService(paymentStrategy);

        PaymentService service1 = new PaymentService(paymentStrategy1);
        Double amount = 1000.0;
        service.makePayment(amount);
        service1.makePayment(amount);
    }
}
