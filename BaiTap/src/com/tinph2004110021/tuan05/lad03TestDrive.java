package com.tinph2004110021.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class lad03TestDrive {
    static List<lad03> l3s = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            menu();
            System.out.println("Nhập Lựa Chọn:");
            int n = sc.nextInt();
            switch(n){
                case 0:
                break;
                case 1:
                nhapLieu();
                break;
                case 2:
                sapXepTangDan();
                break;
                case 3:
                xoaTheoTen();
                break;
                case 4:
                xuatTheoGiaTrungBinh();
                break;
                default:System.out.println("Lựa Chọn Không Hợp Lệ!!!");
            }

        }while(true);
    }
    public static void menu()
    {
        System.out.println("==========================MENU=========================");
        System.out.println("=1================Nhập danh sách sản phẩm==============");
        System.out.println("=2=Sắp xếp giảm dần theo giá và xuất ra màn hình=======");
        System.out.println("=3=Tìm và xóa sản phẩm theo tên nhập từ bàn phím=======");
        System.out.println("=4========Xuất giá trung bình của các sản phẩm=========");
        System.out.println("=0========================THOÁT========================");
    }
    public static void nhapLieu()
    {
        System.out.println("Nhập Số Lượng Sản Phẩm Muốn Thêm:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            lad03 l3 = new lad03();
            l3.nhapLieu();
            l3s.add(l3);
        }
    }
    public static void sapXepTangDan()
    {
        Collections.sort(l3s, new Comparator<lad03>(){

            @Override
            public int compare(lad03 o1, lad03 o2) {
                if(o1.donGia < o2.donGia)
                {
                    return -1;
                }
                return 1;
            }
        });  
        xuatThongTin();
    }
    public static void xoaTheoTen()
    {
        System.out.println("Nhập Tên Sản Phẩm Muốn Xoá:");
        sc.nextLine();
        String name = sc.nextLine();
        for (lad03 lad03 : l3s) {
            if(name.equals(lad03.tenSp))
            {
                l3s.remove(lad03);
                break;
            }
        }
        xuatThongTin();
    }
    public static void xuatTheoGiaTrungBinh()
    {
        Collections.sort(l3s, new Comparator<lad03>(){
            @Override
            public int compare(lad03 o1, lad03 o2) {
                for (lad03 lad03 : l3s) {
                   lad03.xuatDuLieuTb();
                }
                return 0;
            } 
        });
        xuatTb();
    }
    public static void xuatTb()
    {
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n","Tên Sản Phẩm", "Đơn Giá","Giảm Giá","Thuế","Trung Bình");
        for (lad03 lad03 : l3s) {
            lad03.xuatDuLieuTb();
        }
    }
    public static void xuatThongTin()
    {
        System.out.printf("%-20S %-20S %-20S %-20S\n","Tên Sản Phẩm", "Đơn Giá","Giảm Giá","Thuế");
        for (lad03 lad03 : l3s) {
            lad03.xuatDuLieu();
        }
    }
}
