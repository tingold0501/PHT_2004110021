package com.tinph2004110021.tuan05;

import java.util.Scanner;

public class lad03 {
    String tenSp;
    double donGia, giamGia, thueThuNhap, trungBinh;
    static Scanner sc = new Scanner(System.in);
    public lad03()
    {

    }
    public void nhapLieu()
    {
        sc.nextLine();
        System.out.println("Nhập Tên Sản Phẩm:");
        tenSp = sc.nextLine();
        System.out.println("Nhập Đơn Giá Sản Phẩm:");
        donGia = sc.nextDouble();
        System.out.println("Nhập Giảm Giá Sản Phẩm:");
        giamGia = sc.nextDouble();
        System.out.println("Nhập Thuê Thu Nhập:");
        thueThuNhap = sc.nextDouble();
        trungBinh = (donGia + giamGia + thueThuNhap)/3;
    }
    public void xuatDuLieu()
    {
        System.out.printf("%-20S %-20.2f %-20.2f %-20.2f\n", tenSp, donGia, giamGia, thueThuNhap );
    }
    public void xuatDuLieuTb()
    {
        System.out.printf("%-20S %-20.2f %-20.2f %-20.2f %-20f\n", tenSp, donGia, giamGia, thueThuNhap,trungBinh );
    }
}
