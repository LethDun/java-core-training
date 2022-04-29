package com.ec.solid.dip;

public class ShoppingMall {

    private BankCard bankCard;

    public ShoppingMall(BankCard bankCard) {
        this.bankCard = bankCard;
    }

    public void buySomething(long amount) {
        bankCard.doTransaction(amount);
    }

    public static void main(String[] args) {
        // DebitCard debitCard = new DebitCard();
        // CreditCard creditCard = new CreditCard();

        BankCard card = new CreditCard(); //

        ShoppingMall mall = new ShoppingMall(card);

        mall.buySomething(10000);
    }

}
