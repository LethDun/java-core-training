package com.ec.oop.exercises.problem2.model;

public class Newspaper extends Document{

    private int issueDate;

    public Newspaper(Document tempDocument, int issueDate) {
        this.id = tempDocument.id;
        this.publisher = tempDocument.publisher;
        this.number = tempDocument.number;
        this.issueDate = issueDate;
    }

    public Newspaper(int id, String publisher, int number, int issueDate) {
        super(id, publisher, number);
        this.issueDate = issueDate;
    }

    public int getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(int issueDate) {
        this.issueDate = issueDate;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
            super.toString() +
            ", issueDate=" + issueDate +
            '}';
    }
}
