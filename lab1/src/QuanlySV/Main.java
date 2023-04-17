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
        QuanLy a = new QuanLy();
        SinhVienNhap b;
        SinhVienNhap svn = new SinhVienNhap();
        int n;
        Scanner sc = new Scanner(System.in);
    do{
    a.menu();
    System.out.print("Lua chon: ");
    n= sc.nextInt();
    switch(n)
{
        
    case 1 -> {
        b = new SinhVienNhap();
        a.themDSSinhVien(svn);
    break;
}

    case 2 -> {
        a.hienDSSinhVien();
    break;
}

    case 3 -> {
        a.sapXepDS();
        a.hienDSSinhVien();
    break;
}
    
    default->{}
}
}
    while(n!=0);
}
}
    


