/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai1;
 import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner (System.in);
    dsGiaoDich a = new dsGiaoDich();
    do{
    a.menuChinh();
    System.out.print("Lua chon: ");
    n= sc.nextInt();
switch(n)
{
case 1 -> {
a.nhapMangDat();
break;
}

case 2 -> {
a.xuatMangDat();
break;
}

case 3 -> {   
a.nhapMangNha();
break;
}

case 4 -> {
a.xuatMangNha();
break;
}

case 5 -> {
a.TongNhaDat();
break;
}

case 6 -> {
a.tinhTong();    
a.trungBinh();
break;
}
case 7 -> {
a.giaoDichThang9();
break;
}

default->{}
}
}
while(n!=0);
}
    }


