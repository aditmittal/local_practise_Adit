package com.epam.prep.pattern.factoryPattern;

public class MainClass {
    public static void main(String[] args) {

        Notification notification = NotificationFactory.CreateNotification("email");

        notification.send("my msg");
    }
}
