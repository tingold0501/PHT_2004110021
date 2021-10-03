package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class lad02TestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<lad02> lad02s = new ArrayList<>();
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
                themDs();
                break;
                case 2:
                xuat();
                break;
                case 3:
                sapXepNgauNhien();
                break;
                case 4:
                sapXepGiamDan();
                break;
                case 5:
                xoa();
                break;
                default: System.out.println("Lựa Chọn Không Hợp Lệ!!!");
            }
        }while(true);
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
   public static void themDs()
   {
    while(true)
    {
        lad02 l2 = new lad02();
        l2.nhapLieu();
        lad02s.add(l2);
        sc.nextLine();
        System.out.println("Nhập Tiếp Không [Y/N]");
        String n = sc.nextLine();
        if(n.equals("N"))
        {
            break;
        }
    }
   }
   public static void xuat()
   {
       System.out.printf("%-20S %-20S\n","Họ","Tên");
       for (lad02 lad02 : lad02s) {
           lad02.xuat();
       }
   }
   public static void sapXepGiamDan()
   {
       Collections.sort(lad02s, new Comparator<lad02>(){
        @Override
        public int compare(lad02 o1, lad02 o2) {
            return -o1.ten.compareToIgnoreCase(o2.ten);
        }
       });
   }
   public static void sapXepNgauNhien()
   {
       Collections.shuffle(lad02s);;
   }
   public static void xoa()
   {
       sc.nextLine();
       System.out.println("Nhập Họ Cần Xoá:");
       String name = sc.nextLine();
       System.out.println("Nhập Tên Cần Xoá:");
       String name1 = sc.nextLine();
       for (lad02 lad02 : lad02s) {
        if(lad02.ten == name && lad02.ho == name1)
        {
            lad02s.remove(lad02);
        }
        break;
       }
   }
    
}
