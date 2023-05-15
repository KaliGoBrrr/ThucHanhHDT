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
public class GiaoDichDat extends GiaoDich {
    private String loaiDat;

    public GiaoDichDat() {
        super();
    }

    public GiaoDichDat(String loaiDat) {
        super();
        this.loaiDat = loaiDat;
    }

    public String getLoaiDat() {
        return loaiDat;
    }

    public void setLoaiDat(String loaiDat) {
        this.loaiDat = loaiDat;
    }
    
    @Override
    public void nhap(){
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap loai dat (A/B/C): ");
        loaiDat = sc.nextLine();
    }

    @Override
    public String toString() {
        return super.toString()+",loai dat:"+this.loaiDat;
    }
    
}
