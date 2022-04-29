package com.ec.oop.exercises.problem10;

public class TestDocument {

    public static void main(String[] args) {
        Document doc1 = new Document("    Java    lanGuaGe   BaSics         ");
        doc1.show();

        doc1.normalize();
        doc1.show();
        System.out.println("Word counter: " + doc1.wordCount());
        System.out.println("Char counter: " + doc1.charCount("A"));
    }

}
