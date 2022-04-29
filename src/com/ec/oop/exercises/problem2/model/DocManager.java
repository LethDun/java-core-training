package com.ec.oop.exercises.problem2.model;

import java.util.ArrayList;
import java.util.List;

public class DocManager {

    private List<Document> documentList;

    public DocManager() {
        this.documentList = new ArrayList<>();
    }

    public DocManager(List<Document> documentList) {
        this.documentList = documentList;
    }

    public void add(Document document) {
        boolean check = documentList.stream()
            .map(Document::getId)
            .anyMatch(id -> id == document.getId());
        if (check) {
            System.out.println("Đã tồn tại tài liệu có ID = " + document.getId());
            return;
        }
        documentList.add(document);
    }

    public boolean deleteById(int id) {
        Document document = documentList.stream()
            .filter(doc -> doc.getId() == id)
            .findFirst()
            .orElse(null);
        if (document == null) {
            return false;
        }
        documentList.remove(document);
        return true;
    }

    public void showAllDocuments() {
        documentList.forEach(System.out::println);
    }

    public void searchByBook() {
        documentList.stream()
            .filter(doc -> doc instanceof Book)
            .forEach(System.out::println);
    }

    public void searchByMagazine() {
        documentList.stream()
            .filter(doc -> doc instanceof Magazine)
            .forEach(System.out::println);
    }

    public void searchByNewspaper() {
        documentList.stream()
            .filter(doc -> doc instanceof Newspaper)
            .forEach(System.out::println);
    }
}
