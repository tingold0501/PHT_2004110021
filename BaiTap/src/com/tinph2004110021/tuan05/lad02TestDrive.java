package com.tinph2004110021.tuan05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class lad02TestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<lad02> l2s = new ArrayList<>();
    public static void main(String[] args) {
        do{
            menu();
            System.out.println("Nhập Lựa Chọn:");
            int n = sc.nextInt();
            switch(n)
            {
                case 0:
                break;
                case 1:
                nhapLieu();
                break;
                case 2:
                xuatThongTin();
                break;
                case 3:
                xuatNgauNhien();
                break;
                case 4:
                sapXepGiamDan();
                break;
                case 5:
                xoaThongTin();
                break;
                default: System.out.println("Lựa Chọn Không Hợp Lệ!!!");
            }

        }while(true);
    }
    public static void nhapLieu()
    {
        System.out.println("Nhập Số Lượng Sinh Viên Muốn Thêm:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            lad02 l2 = new lad02();
            l2.nhapThongTin();
            l2s.add(l2);
        }
    }
    public static void menu()
    {
        System.out.println("==================MENU================");
        System.out.println("=1======Nhập danh sách họ và tên======");
        System.out.println("=2======Xuất danh sách vừa nhập=======");
        System.out.println("=3=====Xuất danh sách ngẫu nhiên======");
        System.out.println("=4=Sắp xếp giảm dần và xuất danh sách=");
        System.out.println("=5=Tìm và xóa họ tên nhập từ bàn phím=");
        System.out.println("=0================THOÁT===============");
    }
    public static void xuatThongTin()
    {
        System.out.printf("%-20S %-20S\n","họ","tên");
        for (lad02 lad02 : l2s) {
            lad02.xuatThoongTin();
        }
    }
    public static void xuatNgauNhien()
    {
        Collections.shuffle(l2s);
    }
    public static void sapXepGiamDan()
    {
       Collections.sort(l2s, new Comparator<>(){
        @Override
        public int compare(lad02 o1, lad02 o2) {
            return o1.ten.compareToIgnoreCase(o2.ten);
        }   
       });
    }
    public static void xoaThongTin()
    {
        sc.nextLine();
        System.out.println("Nhập Họ Cần Xoá");
        String ho = sc.nextLine();
        System.out.println("Nhập Tên Cần Xoá:");
        String ten = sc.nextLine();
        for (lad02 lad02 : l2s) {
            if(ho.equals(lad02.ho) && ten.equals(lad02.ten))
            l2s.remove(lad02);
            break;
        }
    }
    
}
