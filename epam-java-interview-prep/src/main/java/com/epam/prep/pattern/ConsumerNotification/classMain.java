package com.epam.prep.pattern.ConsumerNotification;

public class classMain {
    public static void main(String[] args){

        NotificationService service = new NotificationService();
        Notification notification = new Notification(" your notification ");

        service.send("EMAIL",notification);
        service.send("TEAMS",notification);
        service.send("SMS",notification);
    }
}
