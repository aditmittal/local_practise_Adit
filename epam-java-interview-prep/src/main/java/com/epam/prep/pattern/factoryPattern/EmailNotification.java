package com.epam.prep.pattern.factoryPattern;

public class EmailNotification implements Notification{

    @Override
    public void send(String mag){
        System.out.println("Sending via email bruh");
    }
}
