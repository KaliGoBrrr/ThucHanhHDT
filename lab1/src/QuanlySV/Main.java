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
        int n;
        Scanner sc = new Scanner(System.in);
    do{
    svn.menu();
    System.out.print("Lua chon: ");
    n= sc.nextInt();
    switch(n)
{
        
    case 1 -> {
        System.out.print("Nhap so luong can them: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++){
        System.out.println("Lan nhap thu " + (i + 1) + ": ");
        svn.nhap();
        }
    break;
}

    case 2 -> {
        System.out.println(""+svn.toString());
    break;
}

    default->{}
}
}
    while(n!=0);
}
}
    


