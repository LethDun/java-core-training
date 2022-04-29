package com.ec.oop.exercises.problem1.model;

import com.ec.oop.exercises.problem1.model.CanBo;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class QLCB {

    private List<CanBo> dsCanBo;

    public QLCB() {
        this.dsCanBo = new ArrayList<CanBo>();
    }

    public QLCB(List<CanBo> dsCanBo) {
        this.dsCanBo = dsCanBo;
    }

    public void add(CanBo canBo) {
        dsCanBo.add(canBo);
    }

    public void searchByName(String name) {
        dsCanBo.stream()
            .filter(canBo -> canBo.getHoTen().contains(name))
            .forEach(System.out::println);
    }

    public void printDsCanBo() {
        dsCanBo.forEach(System.out::println);
    }
}
