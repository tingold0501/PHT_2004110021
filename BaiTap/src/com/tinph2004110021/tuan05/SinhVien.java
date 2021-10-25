package com.tinph2004110021.tuan05;

import java.util.Scanner;

public class SinhVien {
    String hoTenSv;
    double diemTb;
    static Scanner sc = new Scanner(System.in);
    public SinhVien()
    {

    }
    public void nhapLieu()
    {
        System.out.println("Input ID Apple:");
        hoTenSv = sc.nextLine();
        System.out.println("Nhập Điểm Trung Bình Sinh Viên:");
        diemTb = sc.nextDouble();
        sc.nextLine();
    }
    public void xuatDuLieu()
    {
        System.out.printf("%-20S %-20.2f\n",hoTenSv, diemTb);
    }
    
}
