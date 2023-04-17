/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package QuanlySV;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SinhVienNhap {
    
    private int maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;

    public SinhVienNhap() {
    }

    public SinhVienNhap(int maSV, String hoTen, String diaChi, String sTD) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sTD = sTD;
    }

    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getsTD() {
        return sTD;
    }

    public void setsTD(String sTD) {
        this.sTD = sTD;
    }

    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi sinh vien: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap SDT: ");
        sTD = sc.nextLine();
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextInt();
    }
    
    public void hien(){
        System.out.println("SinhVienNhap{" + "MaSoSinhVien: " + getMaSV() + ", Hoten: " + getHoTen() + ", DiaChi: " + getDiaChi() + ", SoDienThoai: " + getsTD() + "}");
    }
    
}
