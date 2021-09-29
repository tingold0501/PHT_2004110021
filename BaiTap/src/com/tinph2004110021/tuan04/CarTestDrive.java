package com.tinph2004110021.tuan04;

import java.util.Scanner;

public class CarTestDrive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập Số Lượng Xe Muốn Thêm");
        int n = sc.nextInt();
        Car[] cars = new Car[n];
        for(int i = 0; i < n; i++)
        {
            cars[i] = new Car();
            cars[i].nhapThongTin();
        }
        System.out.println("=================================Thông Tin Xe=========================");
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n","tên chủ xe", "hãng xe","dòng xe","giấy phép","dung tích xăng");
        for (Car car : cars) {
            car.xuatThongTin();
        }
    }
}
