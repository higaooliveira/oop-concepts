package com.higor.polimorfismo.notificationWithInterface;

public class SmsSender implements NotificationSender{
    @Override
    public void send(String recipient) {
        System.out.println("Sending sms to " + recipient + "\n");
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending sms to "+ recipient + " with a custom message: " + message + "\n");
    }
}
