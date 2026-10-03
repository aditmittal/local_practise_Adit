package com.epam.prep.pattern.factoryPattern;

public class PushNotification implements Notification{
        @Override
        public void send(String mag){
            System.out.println("Sending via push bruh");
        }

}
