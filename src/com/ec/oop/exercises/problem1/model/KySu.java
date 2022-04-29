package com.ec.oop.exercises.problem1.model;

public class KySu extends CanBo {

    private String chuyenNganh;

    public KySu(CanBo tempCanBo, String chuyenNganh) {
        this.hoTen = tempCanBo.hoTen;
        this.tuoi = tempCanBo.tuoi;
        this.gioiTinh = tempCanBo.gioiTinh;
        this.diaChi = tempCanBo.diaChi;
        this.chuyenNganh = chuyenNganh;
    }

    public KySu(String hoTen, int tuoi, String gioiTinh, String diaChi, String chuyenNganh) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.chuyenNganh = chuyenNganh;
    }

    public String getChuyenNganh() {
        return chuyenNganh;
    }

    public void setChuyenNganh(String chuyenNganh) {
        this.chuyenNganh = chuyenNganh;
    }

    @Override
    public String toString() {
        return "KySu{" +
            super.toString() +
            ", chuyenNganh='" + chuyenNganh + '\'' +
            '}';
    }
}
