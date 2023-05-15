/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;
public class Account {
	private int sotk;
	private String tentk;
	private double sotien;
	private String trangthai;
	Locale localVI = new Locale("vi", "vn");
	Scanner sc = new Scanner(System.in);
	public Account() {}
	public Account(int sotk, String tentk, double sotien, String trangthai) {
		this.sotk = sotk;
		this.sotien = sotien;
		this.tentk = tentk;
		this.trangthai = trangthai;
	}
	public long getSotk() {
		return sotk;
	}
	public void setSotk(int sotk) {
		this.sotk = sotk;
	}
	public String getTentk() {
		return tentk;
	}
	public void setTentk(String tentk) {
		this.tentk = tentk;
	}
	public double getSotien() {
		return sotien;
	}
	public void setSotien(double sotien) {
		this.sotien = sotien;
	}
	public String getTrangthai() {
		return trangthai;
	}
	public void setTrangthai(String trangthai) {
		this.trangthai = trangthai;
	}
	@Override
	public String toString() {
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tienvn = currencyVN.format(sotien);
		return "Account [So tai khoan=" + sotk + ", Ten tai khoan=" + tentk + ", So tien=" + tienvn
				+ ", Trang thai=" + trangthai + "]";
	}
	public void naptien() {
		System.out.println("Nhap so tien muon nap: ");
		double tiennap = sc.nextDouble();
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tienvnnap = currencyVN.format(tiennap);
		sotien = tiennap + sotien;
		System.out.println("Ban vua nap: " + tienvnnap + "VND");
	}
	public void ruttien() {
		System.out.println("Nhap so tien rut: ");
		double tienrut = sc.nextDouble();
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tienvnrut = currencyVN.format(tienrut);
		sotien = sotien - tienrut;
		System.out.println("Ban vua rut: " + tienvnrut + "VND");
	}
	public void daohan() {
		double laisuat = 0.035;
		sotien = sotien + sotien*laisuat;
		NumberFormat currencyVN = NumberFormat.getCurrencyInstance(localVI);
		String tiendaohan = currencyVN.format(sotien);
		System.out.println("Dao han: " + tiendaohan + "VND");
	}
	public void nhap() {
                System.out.println("Nhap ten tai khoan: ");
		tentk = sc.nextLine();
		System.out.println("Nhap so tai khoan: ");
		sotk = sc.nextInt();
                System.out.println("Nhap so tien : ");
		sotien = sc.nextLong();
                System.out.println("Nhap trang thai: ");
		trangthai = sc.nextLine();
              
	}
}