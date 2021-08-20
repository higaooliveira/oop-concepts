package com.higor.polimorfismo.notificationWithAbstractClass;

abstract public class NotificationSender {

    abstract public void send(String recipient);
    abstract public void send(String recipient, String message);
}
