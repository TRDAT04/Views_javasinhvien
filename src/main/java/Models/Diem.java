/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author LNV
 */
public class Diem {

    private String masv;
    private String mamon;
    private String mahk;
    private double diem;

    private SinhVien sinhVien;
    private Monhoc monHoc;
    private HocKy hocKy;

    public Diem() {
    }

    public Diem(String masv, String mamon, String mahk, double diem) {
        this.masv = masv;
        this.mamon = mamon;
        this.mahk = mahk;
        this.diem = diem;
    }

    // Getters & setters
    public String getMasv() {
        return masv;
    }

    public void setMasv(String masv) {
        this.masv = masv;
    }

    public String getMamon() {
        return mamon;
    }

    public void setMamon(String mamon) {
        this.mamon = mamon;
    }

    public String getMahk() {
        return mahk;
    }

    public void setMahk(String mahk) {
        this.mahk = mahk;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    public Monhoc getMonHoc() {
        return monHoc;
    }

    public void setMonHoc(Monhoc monHoc) {
        this.monHoc = monHoc;
    }

    public HocKy getHocKy() {
        return hocKy;
    }

    public void setHocKy(HocKy hocKy) {
        this.hocKy = hocKy;
    }
}
