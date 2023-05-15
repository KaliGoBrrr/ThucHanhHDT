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
public class AccountList {
    
    int count;
    Account accList[];
    Account ac = new Account();
    Scanner sc = new Scanner(System.in);
    
    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    
    public AccountList(){       
    }
    
    public void themtk(){ 
        System.out.println("So luong tai khoan: ");  	
        accList = new Account[count];        
        count = sc.nextInt();
        for (int i = 0; i < count; i++) {
        System.out.println("Lan nhap thu " + (i + 1) + ": ");
        ac.nhap();
        sc.nextLine();
        } 
    }
    
    public void xuathinh(){
        /*for (Account ac : accList){
            System.out.println(ac.getSotien()+" "+ac.getSotk()+" "+ac.getTentk()+" "+ac.getTrangthai());
        }*/
        System.out.println(ac.toString());
    }
    
}
    
    
  
