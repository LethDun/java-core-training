package com.ec.oop.exercises.problem4.model;

import java.util.ArrayList;
import java.util.List;

public class Town {

    private List<Family> families;

    public Town() {
        this.families = new ArrayList<>();
    }

    public List<Family> getFamilies() {
        return families;
    }

    public void setFamilies(List<Family> families) {
        this.families = families;
    }

    public void addFamily(Family family) {
        families.add(family);
    }
}
