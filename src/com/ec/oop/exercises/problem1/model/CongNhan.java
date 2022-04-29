package com.ec.oop.exercises.problem1.model;

public class CongNhan extends CanBo {

    private int capBac;

    public CongNhan(CanBo tempCanBo, int capBac) {
        this.hoTen = tempCanBo.hoTen;
        this.tuoi = tempCanBo.tuoi;
        this.gioiTinh = tempCanBo.gioiTinh;
        this.diaChi = tempCanBo.diaChi;
        this.capBac = capBac;
    }

    public CongNhan(String hoTen, int tuoi, String gioiTinh, String diaChi, int capBac) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.capBac = capBac;
    }

    public int getCapBac() {
        return capBac;
    }

    public void setCapBac(int capBac) {
        this.capBac = capBac;
    }

    @Override
    public String toString() {
        return "CongNhan{" +
            super.toString() +
            ", capBac='" + capBac + '\'' +
            '}';
    }
}
