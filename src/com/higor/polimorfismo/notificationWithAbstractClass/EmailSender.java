package com.higor.polimorfismo.notificationWithAbstractClass;

public class EmailSender extends NotificationSender{


    @Override
    public void send(String recipient) {
        System.out.println("Sending email to " + recipient + "\n");
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending email to "+ recipient + " with a custom message: " + message + "\n");
    }
}
