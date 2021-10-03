package com.tinph2004110021.tuan04;

import java.util.Scanner;

public class Computer {
    static Scanner sc = new Scanner(System.in);
    String nhaSx, heDieuHanh, namSx, namBh,ram, cpu;
    double gia;
    Computer()
    {

    }
    Computer(String nSx)
    {
        nhaSx = nSx;
    }
    Computer(String nSx1, String hDh)
    {
        nhaSx = nSx1;
        heDieuHanh = hDh;
    }
    Computer(String nSx2, String hDh1, String nSx)
    {
        nhaSx = nSx2;
        heDieuHanh = hDh1;
        namSx = nSx;
    }
    Computer(String nSx3, String hDh2, String nSx1,String nBh)
    {
        nhaSx = nSx3;
        heDieuHanh = hDh2;
        namSx = nSx1;
        namBh = nBh;
    }
    Computer(String nSx4, String hDh3, String nSx2,String nBh1,String r)
    {
        nhaSx = nSx4;
        heDieuHanh = hDh3;
        namSx = nSx2;
        namBh = nBh1;
        ram = r;
    }
    Computer(String nSx5, String hDh4, String nSx3,String nBh2,String r1, String Cpu)
    {
        nhaSx = nSx5;
        heDieuHanh = hDh4;
        namSx = nSx3;
        namBh = nBh2;
        ram = r1;
        cpu = Cpu;
    }
    Computer(String nSx6, String hDh5, String nSx4,String nBh3,String r2, String Cpu1, double g)
    {
        nhaSx = nSx6;
        heDieuHanh = hDh5;
        namSx = nSx4;
        namBh = nBh3;
        ram = r2;
        cpu = Cpu1;
        gia = g;
    }
    public void nhapLieu()
    {
        System.out.println("Nhập Nhà Sản Xuất:");
        nhaSx = sc.nextLine();
        System.out.println("Nhập Hệ Điều Hành:");
        heDieuHanh = sc.nextLine();
        System.out.println("Nhập Năm Sản Xuất:");
        namSx = sc.nextLine();
        System.out.println("Nhập Năm Bảo Hành:");
        namBh = sc.nextLine();
        System.out.println("Nhập Ram:");
        ram = sc.nextLine();
        System.out.println("Nhập CPU:");
        cpu = sc.nextLine();
        System.out.println("Nhập Giá:");
        gia = sc.nextDouble();
    }
    public void xuatThongTin()
    {
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S %-20.2f\n", nhaSx, heDieuHanh, namSx, namBh, ram, cpu, gia);
    }
}
