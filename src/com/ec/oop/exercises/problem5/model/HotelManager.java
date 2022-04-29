package com.ec.oop.exercises.problem5.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HotelManager {

    private List<Room> rooms;
    private List<Order> orders;

    public HotelManager() {
        this.rooms = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public boolean addRoom(String type) {
        switch (type) {
            case "A":
                rooms.add(new Room("A", 500));
                break;
            case "B":
                rooms.add(new Room("B", 300));
                break;
            case "C":
                rooms.add(new Room("C", 100));
                break;
            default:
                System.out.println("No room of type " + type);
                return false;
        }
        return true;
    }

    public void addOrder(int numberRentalDays, Room room, Person person) {
        boolean check = orders.stream()
            .anyMatch(o -> o.getRoom().equals(room));

        if (check == true) {
            System.out.println("Phòng đã được thuê");
            return;
        }
        orders.add(new Order(numberRentalDays, room, person));
        System.out.println("Đặt phòng thành công");
    }

    public List<Room> getFreeRoom() {
        List<Room> orderedRoom = orders.stream()
            .map(Order::getRoom)
            .collect(Collectors.toList());

        List<Room> freeRoom = new ArrayList<>(rooms);
        freeRoom.removeAll(orderedRoom);
        return freeRoom;
    }

    public boolean removeOrderById(String id) {
        Order order = orders.stream()
            .filter(o -> o.getPerson().getId().equals(id))
            .findFirst()
            .orElse(null);
        return orders.remove(order);
    }

    public int getBill(String id) {
        Order order = orders.stream()
            .filter(o -> o.getPerson().getId().equals(id))
            .findFirst()
            .orElse(null);
        return order.getRentalFee();
    }
}
