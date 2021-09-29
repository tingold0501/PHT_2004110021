package com.tinph2004110021.tuan04;

import java.util.Scanner;

public class BookTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bạn Muốn Nhập Bao Nhiêu Sách:");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for(int i = 0; i < n; i++)
        {
            books[i] = new Book();
            books[i].nhapThongTin();
        }
        System.out.println("===================================================Thông Tin Sách======================================================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S %-20S\n","Giá","Giá Bán","Số Lượng","Nhà Sản XUất","Loại","Năm Xuất Bản");
        for (Book book : books) {
            book.xuatThongTin();
        }
    }
}
