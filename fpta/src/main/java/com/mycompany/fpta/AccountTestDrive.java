/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.fpta;

/**
 *
 * @author Admin
 */
import java.util.*;
public class AccountTestDrive {
     public static void mainold2(String[] args){
        Account myAccount = new Account(1,"Nguyen Trung Hieu",1000000);
        Scanner sc = new Scanner(System.in);
        System.out.println("NHap so tien muon rut:");
        int x = sc.nextInt();
        if(myAccount.debit(x)){
            System.out.println("Rut thanh cong "+x);
        }else{
            System.out.println("So du tai khoan khong du hoac nhap sai so tien");
        }

        Account nam = new Account(2,"Pham The Bach",10000);
        System.out.println("NHap so tien can chuyen khoan:");
        int y = sc.nextInt();
        if(myAccount.tranferTo(nam,y)){
            System.out.println("Chuyen thanh cong sang tai khoan "+nam.getName());
        }else{
            System.out.println("Chuyen khoan that bai");
        }
    }
}
