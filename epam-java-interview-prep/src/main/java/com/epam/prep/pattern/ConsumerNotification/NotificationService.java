package com.epam.prep.pattern.ConsumerNotification;

import java.util.Map;
import java.util.function.Consumer;

public class NotificationService {
    public static final Map<String, Consumer<Notification>> STRATEGY = Map.of(
            "EMAIL", n-> System.out.println("SENDING VIA EMAIL"+n.getMessage()),
            "TEAMS", n-> System.out.println("SENDING VIA TEAMS"+n.getMessage()),
            "SMS", n-> System.out.println("SENDING VIA SMS"+n.getMessage())
    );
    public void send(String type, Notification notification){
        Consumer<Notification> strategy = STRATEGY.get(type);
        strategy.accept(notification);
    }
}
