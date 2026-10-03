package com.epam.prep.pattern.factoryPattern;

public class NotificationFactory {
    public static Notification CreateNotification(String type){
        if(type.equalsIgnoreCase("email")){
            return new EmailNotification();
        }
        else if(type.equalsIgnoreCase("sms")){
            return new SMSNotification();
        } else if (type.equalsIgnoreCase("push")) {
            return new PushNotification();
        }

        throw new IllegalArgumentException(
                "Unknown notification type "+type
        );
    }
}
