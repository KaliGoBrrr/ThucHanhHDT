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
public class GiaoDichNha extends GiaoDich {
    private String loaiNha,diaChi;
    private int choose;

    public GiaoDichNha() {
        super();
    }    

    public GiaoDichNha(String loaiNha, String diaChi) {
        super();
        this.loaiNha = loaiNha;
        this.diaChi = diaChi;
    }

    public String getLoaiNha() {
        return loaiNha;
    }

    public void setLoaiNha(String loaiNha) {
        this.loaiNha = loaiNha;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("Nhap loai nha(0: cao cap, 1: thuong): ");
        choose = sc.nextInt();
        switch (choose){
            case 0 -> loaiNha = "cao cap";
            case 1 -> loaiNha = "thuong";
            default -> System.out.println("Chon so khong hop le");     
        }
    }
    
    @Override
    public String toString() {
        return super.toString()+",loai nha:"+this.loaiNha+", dia chi: "+this.diaChi;
    }
}
