package com.higor.polimorfismo.notificationWithAbstractClass;

public class Main {

    public static void main(String[] args) {
        NotificationSender emailSender = new EmailSender();
        NotificationSender whatsappSender = new WhatsappSender();
        NotificationSender smsSender = new SmsSender();


        NotificationManager manager = new NotificationManager(emailSender);
        manager.notify("higor.oliveira@dextra-sw.com");
//
//        manager.setSender(whatsappSender);
//        manager.notify("99999999999");
//
//
//        manager.setSender(smsSender);
//        manager.notify("99999999999");
    }
}
