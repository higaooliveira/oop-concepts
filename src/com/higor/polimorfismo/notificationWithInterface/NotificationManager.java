package com.higor.polimorfismo.notificationWithInterface;

public class NotificationManager {

    private NotificationSender sender;

    public NotificationSender getSender() {
        return sender;
    }

    public void setSender(NotificationSender sender) {
        this.sender = sender;
    }

    public NotificationManager(NotificationSender sender) {
        this.sender = sender;
    }

    public void notify(String recipient) {
        this.getSender().send(recipient);
        this.getSender().send(recipient, "Minha mensagem customizada");
    }
}
