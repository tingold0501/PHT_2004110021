package com.tinph2004110021.tuan05;

import java.util.Scanner;

public class lad02 {
    static Scanner sc = new Scanner(System.in);
    String ho, ten;
    public lad02()
    {

    }
    public void nhapThongTin()
    {
        System.out.println("Nhập Họ:");
        ho = sc.nextLine();
        System.out.println("Nhập Tên:");
        ten = sc.nextLine();
    }
    public void xuatThoongTin()
    {
        System.out.printf("%-20S %-20S\n",ho, ten);
    }
}
