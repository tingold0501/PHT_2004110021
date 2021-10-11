package com.tinph2004110021.tuan05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SinhVienTestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<SinhVien> svs = new ArrayList<>();
    public static void main(String[] args) {
        do{
            menu();
            System.out.println("Nhập Lựa Chọn Của:");
            int n = sc.nextInt();
            switch(n){
                case 0:
                break;
                case 1:
                nhapLieu();
                break;
                case 2:
                xuatDuLieu();
                break;
                case 3:
                xuatDsSvTheoKhoangDiem();
                break;
                case 4:
                timSvTheoHoTen();
                break;
                case 5:
                timVaSuaSv();
                break;
                case 6:
                timVaXoaSv();
                break;
            }
        }while(true);
    }
    public static void menu(){
    System.out.println("MENU");
    System.out.println("=1=Nhập Danh Sách Sinh Viên");
    System.out.println("=2=Xuất Danh Sách Sinh Viên");
    System.out.println("=3=Xuất Danh Sách Sinh Viên Theo Khoảng Điểm");
    System.out.println("=4=Tìm Sinh Viên Theo Họ Tên");
    System.out.println("=5=Tìm Và Sửa Sinh Viên Theo Tên");
    System.out.println("=6=Tìm Và Xoá Sinh Viên Theo Tên");
    System.out.println("=0=THOÁT");
    }
    public static void nhapLieu()
    {
        System.out.println("Nhập Số Lượng Sinh Viên Muốn Thêm:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            SinhVien sv = new SinhVien();
            sv.nhapLieu();
            svs.add(sv);
        }
    }
    public static void xuatDuLieu()
    {
        System.out.printf("%-20S %-20S\n","họ tên sinh viên","điểm trung bình sinh viên");
        for (SinhVien sinhVien : svs) {
            sinhVien.xuatDuLieu();
        }
    }
    public static void xuatDsSvTheoKhoangDiem()
    {
        System.out.println("Nhập Điểm Cần Tìm:");
        double diem = sc.nextDouble();
        System.out.printf("%-20S %-20S\n","họ tên","điểm trung bình");
        for (SinhVien sinhVien : svs) {
            if(diem == sinhVien.diemTb)
            {
                sinhVien.xuatDuLieu();
                svs.toArray();
            }
            else
            System.out.println("Nhập Liệu Không Hợp Lệ");
        }
    }
    public static void timSvTheoHoTen()
    {
        System.out.println("Nhập Họ Tên Cần Tìm:");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.printf("%-20S %-20S\n","Họ tên","điểm trung bình");
        for (SinhVien sinhVien : svs) {
            if(name.equals(sinhVien.hoTenSv))
            {
                sinhVien.xuatDuLieu();
                svs.toArray(); 
            }
        }
    }
    public static void timVaSuaSv()
    {
        System.out.println("Nhập Tên Sinh Viên Cần Sửa:");
        sc.nextLine();
        String name = sc.nextLine();
        for (SinhVien sinhVien : svs) {
            if(name.equals(sinhVien.hoTenSv))
            {
                sinhVien.nhapLieu();
                System.out.println("Đã Sửa");
                break;
            }
            else
            System.out.println("Họ Tên Không Hợp Lệ");
        }
    }
    public static void timVaXoaSv()
    {
        System.out.println("Nhập Họ Tên Muốn Xoá:");
        sc.nextLine();
        String name = sc.nextLine();
        for (SinhVien sinhVien : svs) {
            if(name.equals(sinhVien.hoTenSv))
            {
                svs.remove(sinhVien);
                System.out.println("Đã Xoá");
                break;
            }
            else
            System.out.println("Họ Tên Không Hợp Lệ");
        }
    }


}


