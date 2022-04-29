package com.ec.oop.exercises.problem2.model;

public class Magazine extends Document{

    private int issueNumber;
    private int issueMonth;

    public Magazine(Document tempDocument, int issueNumber, int issueMonth) {
        this.id = tempDocument.id;
        this.publisher = tempDocument.publisher;
        this.number = tempDocument.number;
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public Magazine(int id, String publisher, int number, int issueNumber, int issueMonth) {
        super(id, publisher, number);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }

    public int getIssueMonth() {
        return issueMonth;
    }

    public void setIssueMonth(int issueMonth) {
        this.issueMonth = issueMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
            super.toString() +
            ", issueNumber=" + issueNumber +
            ", issueMonth=" + issueMonth +
            '}';
    }
}
