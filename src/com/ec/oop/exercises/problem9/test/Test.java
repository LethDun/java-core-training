package com.ec.oop.exercises.problem9.test;

import com.ec.oop.exercises.problem9.models.Customer;
import com.ec.oop.exercises.problem9.models.ElectricalBill;
import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        // List<ElectricalBill> billList = new ArrayList<>();
        Customer customer1 = new Customer("Tin", "HN", "1a23");
        Customer customer2 = new Customer("Chung", "DN", "2r31");

        ElectricalBill bill1 = new ElectricalBill(customer1, 250, 340);
        ElectricalBill bill2 = new ElectricalBill(customer2, 145, 268);

        System.out.println(bill1);
        System.out.println(bill2);

        System.out.println("---------------------");
        bill1.updateCustomer("Tung", "HN", "1a11");
        System.out.println(bill1);
        System.out.println("Bill 1 payment: " + bill1.getPayment());
    }

}
