package com.ec.oop.exercises.problem5.test;

import com.ec.oop.exercises.problem5.model.HotelManager;
import com.ec.oop.exercises.problem5.model.Person;
import com.ec.oop.exercises.problem5.model.Room;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        HotelManager manager = new HotelManager();

        while (true) {
            menu(manager);
        }
    }

    private static void menu(HotelManager manager) {
        System.out.println("MENU:");
        System.out.println("1. Tạo phòng");
        System.out.println("2. Danh sách phòng");
        System.out.println("3. Tìm phòng trống");
        System.out.println("4. Tạo Order");
        System.out.println("5. Xoá Order");
        System.out.println("6. Tính tiền");
        System.out.println("7. Thoát");
        int i = new Scanner(System.in).nextInt();

        switch (i) {
            case 1: {
                System.out.println("Loại phòng:");
                String t = new Scanner(System.in).nextLine();
                if (manager.addRoom(t)) {
                    System.out.println("Tạo phòng thành công");
                }
                break;
            }

            case 2: {
                System.out.println("Danh sách phòng:");
                System.out.println(manager.getRooms());
                break;
            }

            case 3: {
                System.out.println("Phòng còn trống:");
                System.out.println(manager.getFreeRoom());
                break;
            }
            case 4: {
                System.out.println("Nhập thông tin khách");
                System.out.println("Họ tên:");
                String name = new Scanner(System.in).nextLine();
                System.out.println("Tuổi:");
                int age = new Scanner(System.in).nextInt();
                System.out.println("Số CMND:");
                String id = new Scanner(System.in).nextLine();
                Person person = new Person(name, age, id);

                System.out.println("Chọn phòng:");
                int roomId = new Scanner(System.in).nextInt();
                Room room = manager.getRooms().get(roomId - 1);

                System.out.println("Số ngày thuê:");
                int rentalTime = new Scanner(System.in).nextInt();

                manager.addOrder(rentalTime, room, person);
                break;
            }
            case 5: {
                System.out.println("Xoá Order. Nhập số CMND:");
                String id = new Scanner(System.in).nextLine();
                if (manager.removeOrderById(id)) {
                    System.out.println("Xoá order thành công");
                } else {
                    System.out.println("Không tồn tại số CMND này");
                }
                break;
            }
            case 6: {
                System.out.println("Tính tiền. Nhập số CMND");
                String id = new Scanner(System.in).nextLine();
                System.out.println("Tiền phòng: " + manager.getBill(id));
                break;
            }
            case 7: {
                System.err.println("Cảm ơn bạn đã sử dụng chương trình!");
                System.exit(0);
            }
            default:
                System.out.println("Nhập sai, mời nhập lại");
                break;
        }
    }

}
