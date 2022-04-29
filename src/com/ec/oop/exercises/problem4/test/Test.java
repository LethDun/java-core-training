package com.ec.oop.exercises.problem4.test;

import com.ec.oop.exercises.problem4.model.Family;
import com.ec.oop.exercises.problem4.model.Person;
import com.ec.oop.exercises.problem4.model.Town;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        Town town = new Town();
        System.out.println("Nhập n:");
        int n = new Scanner(System.in).nextInt();

        for (int i = 0; i < n; i++) {
            Family tempFamily = new Family();
            System.out.println("Hộ gia đình số " + (i+1));
            System.out.println("Nhập số thành viên trong hộ gia đình:");
            int s = new Scanner(System.in).nextInt();

            for (int j = 0; j < s; j++) {
                System.out.println("Họ tên:");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Tuổi:");
                int age = new Scanner(System.in).nextInt();
                System.out.println("Nghề nghiệp:");
                String job = new Scanner(System.in).nextLine();
                System.out.println("Số CMND:");
                String id = new Scanner(System.in).nextLine();
                tempFamily.addPerson(new Person(name, age, job, id));
            }

            town.addFamily(tempFamily);
        }

        System.out.println("Thông tin các hộ trong khu phố:");
        town.getFamilies().stream().forEach(System.out::println);

    }

}
