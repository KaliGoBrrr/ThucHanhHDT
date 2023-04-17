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
    
    private String maSV;
    private String hoTen;
    private String diaChi;
    private String sTD;

    public SinhVienNhap() {
    }

    public SinhVienNhap(String maSV, String hoTen, String diaChi, String sTD) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sTD = sTD;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
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

    @Override
    public String toString() {
        return "SinhVienNhap{" + "maSV=" + maSV + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", SDT=" + sTD + '}';
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextLine();
        System.out.println("Nhap ho ten sinh vien: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi sinh vien: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap SDT: ");
        sTD = sc.nextLine();
    }
    
    public void menu(){
        System.out.println("|=============================================|");
        System.out.println("|1. Nhap thong tin sinh vien                  |");
        System.out.println("|2. Xuat ban danh sach sinh vien              |");
        System.out.println("|============Nhap phim 0 de thoat=============|");
    }
}
