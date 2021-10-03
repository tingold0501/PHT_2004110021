package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class ComputerTestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<Computer> computers = new ArrayList<>();
    public static void main(String[] args) {
        do
        {
            menu();
            System.out.println("Nhập Lựa Chọn:");
            int n = sc.nextInt();
            switch(n)
            {
                case 0:
                break;
                case 1:
                themMayTinh();
                break;
                case 2:
                xoaThongTin();
                break;
                case 3:
                inThongTin();
                break;
                case 4:
                suaThongTin();
                break;
                case 5:
                sapXepTheoGia();
                break;
                default: System.out.println("Lựa Chọn Không Hợp Lệ!!!");
            }
        }while(true);

    }
    public static void menu()
    {
        System.out.println("==================MENU==============");
        System.out.println("=1===========Thêm Máy Tính==========");
        System.out.println("=2============Xoá Thông Tin=========");
        System.out.println("=3=========Hiển Thị Danh Sách=======");
        System.out.println("=4============Sửa Thông Tin=========");
        System.out.println("=5==========Sắp Xếp Theo Giá========");
        System.out.println("=0================THOÁT=============");
    }
    public static void themMayTinh()
    {
        System.out.println("Nhập Số Lượng Muốn Thêm");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Computer cp = new Computer();
            cp.nhapLieu();
            computers.add(cp);
        }
    }
    public static void xoaThongTin()
    {
        System.out.println("Nhập Giá Muốn Xoá:");
        double g = sc.nextDouble();
        for (Computer computer : computers) {
            if(computer.gia == g)
            {
                computers.remove(computer);
            } 
        }
    }
    public static void inThongTin()
    {
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S %-20S\n","Nhà Sản Xuất", "Hệ Điều Hành", "Năm Sản Xuất","Năm Bảo Hành","Ram","CPU","Giá");
        for (Computer computer : computers) {
            computer.xuatThongTin();
        }
    }
    public static void suaThongTin()
    {
        System.out.println("Nhập Giá Cần Sửa:");
        double g = sc.nextDouble();
        for (Computer computer : computers) {
            if(computer.gia == g)
            {
                computer.nhapLieu();
            }
        }
    }
    public static void sapXepTheoGia()
    {
        Collections.sort(computers, new Comparator<Computer>(){

            @Override
            public int compare(Computer o1, Computer o2) {
                if(o1.gia < o2.gia)
                {
                    return -1;
                }
                return 1;
            }
        });
    }
}
