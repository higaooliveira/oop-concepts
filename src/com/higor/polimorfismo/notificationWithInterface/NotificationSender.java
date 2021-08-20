package com.higor.polimorfismo.notificationWithInterface;

public interface NotificationSender {

    public void send(String recipient);
    public void send(String recipient, String message);
}
