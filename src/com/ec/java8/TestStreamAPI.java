package com.ec.java8;

import java.util.ArrayList;
import java.util.List;

public class TestStreamAPI {


    // List order của cửa hàng: id, name, value, type,
    // lọc ra order loại 1;
    // sắp xếp order theo giá trị
    // in ra các order ID

    public static void main(String[] args) {
        List<Order> orderList = new ArrayList<>();

        orderList.add(new Order(1, "Trà sữa", 30000, "type1"));
        orderList.add(new Order(2, "Bia", 100000, "type1"));
        orderList.add(new Order(3, "Cơm", 10000, "type2"));
        orderList.add(new Order(4, "Coca", 15000, "type1"));

        orderList.stream()
                .filter(o -> o.getType().equals("type1"))
                .sorted((o1, o2) -> o2.getValue() - o1.getValue())
                .forEach(System.out::println);

    }




}
