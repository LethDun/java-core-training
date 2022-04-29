package com.ec.oop.exercises.problem10;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Document {

    private String st;

    public Document() {
    }

    public Document(String st) {
        this.st = st;
    }

    public String getSt() {
        return st;
    }

    public void setSt(String st) {
        this.st = st;
    }

    public void normalize() {
        st = st.trim();
        st = st.replaceAll("\\s+", " ");
        st = st.toLowerCase();

        String[] tempString = st.split(" ");
        st = Arrays.stream(tempString)
            .map(str -> String.valueOf(str.charAt(0)).toUpperCase() + str.substring(1))
            .collect(Collectors.joining(" "));
    }

    public int wordCount() {
        this.normalize();
        return st.split(" ").length;
    }

    public long charCount(String character) {
        //this.normalize();
        return Arrays.stream(st.split(""))
            .filter(c -> c.equalsIgnoreCase(character))
            .count();
    }
    public void show() {
        System.out.println(st);
    }
}
