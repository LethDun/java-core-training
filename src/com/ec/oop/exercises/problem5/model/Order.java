package com.ec.oop.exercises.problem5.model;


public class Order {

    private int numberRentalDays;
    private Room room;
    private Person person;

    public Order(int numberRentalDays, Room room, Person person) {
        this.numberRentalDays = numberRentalDays;
        this.room = room;
        this.person = person;
    }

    public int getNumberRentalDays() {
        return numberRentalDays;
    }

    public void setNumberRentalDays(int numberRentalDays) {
        this.numberRentalDays = numberRentalDays;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getRentalFee() {
        return numberRentalDays * room.getPrice();
    }

    @Override
    public String toString() {
        return "Order{" +
            "numberRentalDays=" + numberRentalDays +
            ", room=" + room +
            ", person=" + person +
            '}';
    }
}
