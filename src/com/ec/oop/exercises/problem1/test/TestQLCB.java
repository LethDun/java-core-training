package com.ec.oop.exercises.problem1.test;

import com.ec.oop.exercises.problem1.model.CanBo;
import com.ec.oop.exercises.problem1.model.CongNhan;
import com.ec.oop.exercises.problem1.model.KySu;
import com.ec.oop.exercises.problem1.model.NhanVien;
import com.ec.oop.exercises.problem1.model.QLCB;
import java.util.Scanner;

public class TestQLCB {

    private static QLCB qlcb = new QLCB();

    public static CanBo basicInfo() {
        System.out.println("Họ tên:");
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("Tuổi:");
        int tuoi = new Scanner(System.in).nextInt();
        System.out.println("Giới tính (nam, nữ, khác):");
        String gioiTinh = new Scanner(System.in).nextLine();
        System.out.println("Địa chỉ:");
        String diaChi = new Scanner(System.in).nextLine();
        return new CanBo(hoTen, tuoi, gioiTinh, diaChi);
    }

    public static void menu() {
        System.out.println("MENU");
        System.out.println("1. Thêm");
        System.out.println("2. Tìm kiếm theo họ tên");
        System.out.println("3. Thông tin danh sách cán bộ");
        System.out.println("4. Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        int i = new Scanner(System.in).nextInt();

        switch (i) {
            case 1: {
                System.out.println("Thêm mới cán bộ");
                System.out.println("a) Công nhân");
                System.out.println("b) Kỹ sư");
                System.out.println("c) Nhân viên");
                System.out.println("Nhập lựa chọn:");
                String a = new Scanner(System.in).nextLine();

                switch (a) {
                    case "a": {
                        CanBo tempCanBo = basicInfo();
                        System.out.println("Cấp bậc:");
                        int capBac = new Scanner(System.in).nextInt();
                        CanBo canBo = new CongNhan(tempCanBo, capBac);
                        qlcb.add(canBo);
                        break;
                    }
                    case "b": {
                        CanBo tempCanBo = basicInfo();
                        System.out.println("Chuyên ngành:");
                        String chuyenNganh = new Scanner(System.in).nextLine();
                        CanBo canBo = new KySu(tempCanBo, chuyenNganh);
                        qlcb.add(canBo);
                        break;
                    }
                    case "c": {
                        CanBo tempCanBo = basicInfo();
                        System.out.println("Công việc:");
                        String congViec = new Scanner(System.in).nextLine();
                        CanBo canBo = new NhanVien(tempCanBo, congViec);
                        qlcb.add(canBo);
                        break;
                    }
                    default:
                        System.out.println("Nhập sai");
                        break;
                }
                break;
            }
            case 2: {
                System.out.println("Tìm kiếm theo họ tên:");
                String hoTen = new Scanner(System.in).nextLine();
                qlcb.searchByName(hoTen);
                break;
            }
            case 3: {
                System.out.println("Thông tin danh sách các cán bộ");
                qlcb.printDsCanBo();
                break;
            }
            case 4: {
                System.err.println("Cảm ơn bạn đã sử dụng chương trình!!");
                System.exit(0);
            }
            default:
                System.out.println("Nhập sai, mời nhập lại");
                break;
        }
    }

    public static void main(String[] args) {
        while (true) {
            menu();
        }
    }
}
