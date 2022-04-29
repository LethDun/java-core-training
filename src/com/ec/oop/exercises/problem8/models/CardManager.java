package com.ec.oop.exercises.problem8.models;

import java.util.ArrayList;
import java.util.List;

public class CardManager {

    private List<LibraryCard> cardList;

    public CardManager() {
        this.cardList = new ArrayList<LibraryCard>();
    }

    public List<LibraryCard> getCardList() {
        return cardList;
    }

    public void setCardList(List<LibraryCard> cardList) {
        this.cardList = cardList;
    }

    public void addCard(LibraryCard card) {
        cardList.add(card);
    }

    public boolean deleteCardById(int id) {
        LibraryCard card = cardList.stream()
            .filter(c -> c.getId() == id)
            .findFirst()
            .orElse(null);

        if (card != null) {
            return cardList.remove(card);
        }
        return false;
    }

    public void showCardList() {
        cardList.forEach(System.out::println);
    }
}
