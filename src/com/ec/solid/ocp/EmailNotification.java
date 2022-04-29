package com.ec.solid.ocp;

public class EmailNotification implements NotificationService{

    @Override
    public void sendOTP(String mediumType) {
        System.out.println("send via email");
    }

    @Override
    public void sendReport() {
    }
}
