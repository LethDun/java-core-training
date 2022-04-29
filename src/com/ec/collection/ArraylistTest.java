package com.ec.collection;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class ArraylistTest {

    public static void main(String[] args) {

        Set set = new HashSet();

        List<String> list = new ArrayList<>();

        String s1 = new String("String 1");
        String s3 = new String("String 3");
        String s2 = new String("String 2");
        String s4 = new String("String 4");
        String s5 = new String("String 5");

        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

        if (list.contains(s5)) {
            System.out.println("List co chua String 1");
        }
        else {
            System.out.println("List ko chua String 1");
        }

        System.out.println("ArrayList");
        for (String s: list) {
            System.out.println(s);
        }

        LinkedList<String> list2 = new LinkedList<>(list);
        list2.add(s5);

        list2.remove(s2);

        System.out.println("LinkedList");

        for ( String s: list2) {
            System.out.println(s);
        }
    }

    List<String> l1 = new LinkedList<>();

}
