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
public class Main {
    public static void main(String[] args) {
        SinhVienNhap svn = new SinhVienNhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong can them: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
        System.out.println("Lan nhap thu " + (i + 1) + ": ");
        svn.nhap();
        System.out.println(""+svn.toString());
    }
  }
}
