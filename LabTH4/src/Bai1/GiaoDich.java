/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class GiaoDich {
    private String maGiaoDich, ngayGiaoDich;
    private long donGia;
    private float dienTich;
    

    public GiaoDich() {
        super();
    }

    public GiaoDich(String maGiaoDich, String ngayGiaoDich, long donGia, float dienTich) {
        super();
        this.maGiaoDich = maGiaoDich;
        this.ngayGiaoDich = ngayGiaoDich;
        this.donGia = donGia;
        this.dienTich = dienTich;
    }

    public String getMaGiaoDich() {
        return maGiaoDich;
    }

    public void setMaGiaoDich(String maGiaoDich) {
        this.maGiaoDich = maGiaoDich;
    }

    public String getNgayGiaoDich() {
        return ngayGiaoDich;
    }

    public void setNgayGiaoDich(String ngayGiaoDich) {
        this.ngayGiaoDich = ngayGiaoDich;
    }

    public long getDonGia() {
        return donGia;
    }

    public void setDonGia(long danGia) {
        this.donGia = danGia;
    }

    public float getDienTich() {
        return dienTich;
    }

    public void setDienTich(float dienTich) {
        this.dienTich = dienTich;
    }
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma giao dich: ");
        maGiaoDich=sc.nextLine();
        System.out.println("Nhap ngay giao dich(ngay/thang/nam): ");
        ngayGiaoDich = sc.nextLine();
        System.out.println("Nhap don gia: ");
        donGia = Long.parseLong(sc.nextLine());
        System.out.println("Nhap dien tich: ");
        dienTich = Float.parseFloat(sc.nextLine());
    }

    @Override
    public String toString() {
        return "Ma giao dich: "+this.maGiaoDich+", ngay giao dich: "+this.maGiaoDich+", don gia: "+this.donGia+", dien tich: "+this.dienTich;
    }
   
}
