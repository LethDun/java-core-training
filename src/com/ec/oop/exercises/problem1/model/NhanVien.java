package com.ec.oop.exercises.problem1.model;

public class NhanVien extends CanBo{

    private String congViec;

    public NhanVien(CanBo tempCanBo, String congViec) {
        this.hoTen = tempCanBo.hoTen;
        this.tuoi = tempCanBo.tuoi;
        this.gioiTinh = tempCanBo.gioiTinh;
        this.diaChi = tempCanBo.diaChi;
        this.congViec = congViec;
    }

    public NhanVien(String hoTen, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(hoTen, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
            super.toString() +
            ", congViec='" + congViec + '\'' +
            '}';
    }
}
