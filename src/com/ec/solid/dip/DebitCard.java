package com.ec.solid.dip;

public class DebitCard implements BankCard{

    public void doTransaction(long amount) {
        System.out.println("payment using Dedit card: " + amount);
    }

}
