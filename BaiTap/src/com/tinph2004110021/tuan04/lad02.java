package com.tinph2004110021.tuan04;

import java.util.Scanner;

public class lad02 {
    String ho,ten;
    static Scanner sc = new Scanner(System.in);
    lad02()
    {

    }
    public void nhapLieu()
    {
        System.out.println("Nhập Họ:");
        ho = sc.nextLine();
        System.out.println("Nhập Tên:");
        ten = sc.nextLine();
    }
    public void xuat()
    {
        System.out.printf("%-20S %-20S\n", ho, ten);
    }
   
}
