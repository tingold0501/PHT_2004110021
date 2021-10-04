package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class BookTestDrive {
    static List<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
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
                themSach();
                break;
                case 2:
                xoaSach();
                break;
                case 3:
                inThongTin();
                break;
                case 4:
                suaThongTin();
                break;
                case 5:
                sapXepTheoGiaBan();
                break;
                default: System.out.println("Lựa Chọn Không Hợp Lệ!!!!");
            }
        }while(true);
       
    }
    public static void menu()
    {
        System.out.println("==================MENU==============");
        System.out.println("=1=============Thêm Sách============");
        System.out.println("=2============Xoá Thông Tin=========");
        System.out.println("=3=========Hiển Thị Danh Sách=======");
        System.out.println("=4============Sửa Thông Tin=========");
        System.out.println("=5==========Sắp Xếp Theo Giá========");
        System.out.println("=0================THOÁT=============");
    }
    public static void themSach()
    {
        System.out.println("Nhập Số Lượng Muốn Thêm:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Book b = new Book();
            b.nhapThongTin();
            books.add(b);
        }
    }
    public static void xoaSach()
    {
        //sc.nextLine();
        System.out.println("Nhập Giá Sách Muốn Xoá:");
        double g = sc.nextDouble();
        for (Book book : books) {
            if(book.gia == g)
            {
                books.remove(book);
            }
            break;
        }
    }
    public static void inThongTin()
    {
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n", "Giá","Giá Bán", "Số Lượng","Nhà Sản Xuất","Loại","Năm Sản Xuất");
        for (Book book : books) {
            book.xuatThongTin();
        }
    }
    public static void suaThongTin()
    {
        System.out.println("Nhập Giá Muốn Sửa:");
        float g = sc.nextFloat();
        for (Book book : books) {
            if(book.gia == g)
            book.nhapThongTin();
        }
    }
    public static void sapXepTheoGiaBan()
    {
        Collections.sort(books, new Comparator<Book>(){
            @Override
            public int compare(Book o1, Book o2) {
                if(o1.giaBan < o2.giaBan)
                {
                    return -1;
                }
                return 1;
            }
        });
    }
}
