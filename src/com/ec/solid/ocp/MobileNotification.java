package com.ec.solid.ocp;

public class MobileNotification implements NotificationService{

    @Override
    public void sendOTP(String mediumType) {
        System.out.println("send via mobile");
    }

    @Override
    public void sendReport() {

    }
}
