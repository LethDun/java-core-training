package com.ec.oop.exercises.problem2.model;

public class Book extends Document{

    private String author;
    private int numberOfPages;

    public Book(Document tempDocument, String author, int numberOfPages) {
        this.id = tempDocument.id;
        this.publisher = tempDocument.publisher;
        this.number = tempDocument.number;
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public Book(int id, String publisher, int number, String author, int numberOfPages) {
        super(id, publisher, number);
        this.author = author;
        this.numberOfPages = numberOfPages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
            super.toString() +
            ", author='" + author + '\'' +
            ", numberOfPages=" + numberOfPages +
            '}';
    }
}
