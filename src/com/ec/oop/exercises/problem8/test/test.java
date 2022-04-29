package com.ec.oop.exercises.problem8.test;

import com.ec.oop.exercises.problem8.models.CardManager;
import com.ec.oop.exercises.problem8.models.LibraryCard;
import com.ec.oop.exercises.problem8.models.Student;

public class test {

    public static void main(String[] args) {
        CardManager cardManager = new CardManager();
        LibraryCard card1 = new LibraryCard(1, 12, 30, "1A21",
            new Student("ngA", 15, "9A"));
        LibraryCard card2 = new LibraryCard(2, 3, 25, "1A34",
            new Student("trB", 21, "23d"));
        LibraryCard card3 = new LibraryCard(3, 10, 15, "2D56",
            new Student("phC", 18, "12B"));

        cardManager.addCard(card1);
        cardManager.addCard(card2);
        cardManager.addCard(card3);

        cardManager.showCardList();

        System.out.println("-------------------------");
        cardManager.deleteCardById(2);
        cardManager.showCardList();
    }

}
