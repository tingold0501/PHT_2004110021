package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Account {
    String tenTk;
    int stk;
    float soDu;
    static List<Account> accounts = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    Account()
    {
    }
    Account(String name){
        tenTk = name;
    }
    Account(String ten, int sTk)
    {
        tenTk = ten;
        stk = sTk;
    }
    Account(String tenTK, int STK,float soDuTk )
    {
        tenTk = tenTK;
        stk = STK;
        soDu = soDuTk;
    }
    public void nhapThongTin(){
        sc.nextLine();
        System.out.println("Nhâp Tên Account:");
        tenTk = sc.nextLine();
        System.out.println("Nhập Số Tài Khoản:");
        stk = sc.nextInt();
        System.out.println("Nhập Số Dư:");
        soDu = sc.nextFloat();
    }
    public void xuatThongTin()
    {
        System.out.printf("%-20S %-20d %-5.2f VNĐ\n" ,tenTk,stk,soDu);
    }
}

