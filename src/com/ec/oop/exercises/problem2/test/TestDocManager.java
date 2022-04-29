package com.ec.oop.exercises.problem2.test;

import com.ec.oop.exercises.problem2.model.Book;
import com.ec.oop.exercises.problem2.model.DocManager;
import com.ec.oop.exercises.problem2.model.Document;
import com.ec.oop.exercises.problem2.model.Magazine;
import com.ec.oop.exercises.problem2.model.Newspaper;
import java.util.Scanner;

public class TestDocManager {

    private static DocManager docManager = new DocManager();

    public static Document basicInfo() {
        System.out.println("ID:");
        int id = new Scanner(System.in).nextInt();
        System.out.println("Nhà xuất bản:");
        String publisher = new Scanner(System.in).nextLine();
        System.out.println("Số bản phát hành:");
        int number = new Scanner(System.in).nextInt();
        return new Document(id, publisher, number);
    }


    private static void menu() {

        System.out.println("MENU");
        System.out.println("1. Thêm mới");
        System.out.println("2. Xoá theo mã tài liệu");
        System.out.println("3. Thông tin tài liệu");
        System.out.println("4. Tìm kiếm tài liệu theo loại");
        System.out.println("5. Thoát");
        System.out.println("Nhập lựa chọn của bạn: ");
        int i = new Scanner(System.in).nextInt();

        switch (i) {
            case 1: {
                System.out.println("Thêm mới tài liệu");
                System.out.println("a) Sách");
                System.out.println("b) Tạp chí");
                System.out.println("c) Báo");
                System.out.println("Nhập lựa chọn:");
                String type = new Scanner(System.in).nextLine();

                switch (type) {
                    case "a": {
                        Document tempDocument = basicInfo();
                        System.out.println("Tác giả:");
                        String author = new Scanner(System.in).nextLine();
                        System.out.println("Số trang:");
                        int numberOfPages = new Scanner(System.in).nextInt();
                        Document document = new Book(tempDocument, author, numberOfPages);
                        docManager.add(document);
                        break;
                    }
                    case "b": {
                        Document tempDocument = basicInfo();
                        System.out.println("Số phát hành:");
                        int issueNumber = new Scanner(System.in).nextInt();
                        System.out.println("Tháng phát hành:");
                        int issueMonth = new Scanner(System.in).nextInt();
                        Document document = new Magazine(tempDocument, issueNumber, issueMonth);
                        docManager.add(document);
                        break;
                    }
                    case "c": {
                        Document tempDocument = basicInfo();
                        System.out.println("Ngày phát hành:");
                        int issueDate = new Scanner(System.in).nextInt();
                        Document document = new Newspaper(tempDocument, issueDate);
                        docManager.add(document);
                        break;
                    }
                    default:
                        System.out.println("Nhập sai");
                        break;
                }
                break;
            }

            case 2: {
                System.out.println("Xoá tài liệu theo ID:");
                int id = new Scanner(System.in).nextInt();
                if (docManager.deleteById(id)) {
                    System.out.println("Xoá tài liệu thành công");
                } else {
                    System.out.println("Không tồn tại tài liệu có ID = " + id);
                }
                break;
            }

            case 3: {
                System.out.println("Thông tin các tài liệu:");
                docManager.showAllDocuments();
                break;
            }

            case 4: {
                System.out.println("Tìm kiếm tài liệu theo loại:");
                System.out.println("a) Sách");
                System.out.println("b) Tạp chí");
                System.out.println("c) Báo");
                String type = new Scanner(System.in).nextLine();

                switch (type) {
                    case "a":
                        docManager.searchByBook();
                        break;
                    case "b":
                        docManager.searchByMagazine();
                        break;
                    case "c":
                        docManager.searchByNewspaper();
                        break;
                    default:
                        System.out.println("Nhập sai");
                        break;
                }
                break;
            }

            case 5: {
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
