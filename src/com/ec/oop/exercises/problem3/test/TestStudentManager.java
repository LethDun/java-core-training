package com.ec.oop.exercises.problem3.test;

import com.ec.oop.exercises.problem3.model.Student;
import com.ec.oop.exercises.problem3.model.StudentA;
import com.ec.oop.exercises.problem3.model.StudentB;
import com.ec.oop.exercises.problem3.model.StudentC;
import com.ec.oop.exercises.problem3.model.StudentManager;
import java.util.Scanner;

public class TestStudentManager {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        while (true) {
            menu(studentManager);
        }
    }

    private static void menu(StudentManager studentManager) {
        System.out.println("MENU:");
        System.out.println("1. Thêm");
        System.out.println("2. Xem thông tin");
        System.out.println("3. Tìm số báo danh");
        System.out.println("4. Thoát");
        int i = new Scanner(System.in).nextInt();

        switch (i) {
            case 1: {
                System.out.println("Thêm học sinh ở khối?");
                System.out.println("a) Khối A");
                System.out.println("b) Khối B");
                System.out.println("c) Khối C");
                String t = new Scanner(System.in).nextLine();

                switch (t) {
                    case "a": {
                        studentManager.addStudent(studentInfo("a"));
                        break;
                    }
                    case "b": {
                        studentManager.addStudent(studentInfo("b"));
                        break;
                    }
                    case "c": {
                        studentManager.addStudent(studentInfo("c"));
                        break;
                    }
                    default:
                        System.out.println("Nhập sai");
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("Thông tin các thí sinh:");
                studentManager.showStudentsInfo();
                break;
            }
            case 3: {
                System.out.println("Nhập số báo danh:");
                String id = new Scanner(System.in).nextLine();
                System.out.println(studentManager.searchById(id));
                break;
            }
            case 4: {
                System.err.println("Cảm ơn bạn đã sử dụng chương trình!");
                System.exit(0);
            }
            default:
                System.out.println("Nhập sai, mời nhập lại");
                break;
        }
    }

    private static Student studentInfo(String t) {
        System.out.println("Số báo danh:");
        String id = new Scanner(System.in).nextLine();
        System.out.println("Họ tên:");
        String name = new Scanner(System.in).nextLine();
        System.out.println("Địa chỉ:");
        String address = new Scanner(System.in).nextLine();
        System.out.println("Mức ưu tiên:");
        String priority = new Scanner(System.in).nextLine();

        if (t.equals("a")) {
            return new StudentA(id, name, address, priority);
        }
        if (t.equals("b")) {
            return new StudentB(id, name, address, priority);
        }
        return new StudentC(id, name, address, priority);
    }

}
