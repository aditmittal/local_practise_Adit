package com.epam.prep.pattern.factoryPattern;

public class SMSNotification implements Notification{

    @Override
    public void send(String mag){
        System.out.println("Sending via SMS bruh");
    }

}
