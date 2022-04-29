package com.ec.oop.exercises.problem8.models;

public class LibraryCard {

    private int id;
    private int borrowDate;
    private int returnDate;
    private String bookId;
    private Student student;

    public LibraryCard() {
    }

    public LibraryCard(int id, int borrowDate, int returnDate, String bookId,
        Student student) {
        this.id = id;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
        this.bookId = bookId;
        this.student = student;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(int borrowDate) {
        this.borrowDate = borrowDate;
    }

    public int getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(int returnDate) {
        this.returnDate = returnDate;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Override
    public String toString() {
        return "LibraryCard{" +
            "id=" + id +
            ", borrowDate=" + borrowDate +
            ", returnDate=" + returnDate +
            ", bookId='" + bookId + '\'' +
            ", student=" + student +
            '}';
    }
}
