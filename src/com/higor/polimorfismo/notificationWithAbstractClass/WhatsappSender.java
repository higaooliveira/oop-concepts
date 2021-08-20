package com.higor.polimorfismo.notificationWithAbstractClass;

public class WhatsappSender extends NotificationSender{

    @Override
    public void send(String recipient) {
        System.out.println("Sending whatsapp message to " + recipient + "\n");
    }

    @Override
    public void send(String recipient, String message) {
        System.out.println("Sending whatsapp to "+ recipient + " with a custom message: " + message + "\n");
    }

}
