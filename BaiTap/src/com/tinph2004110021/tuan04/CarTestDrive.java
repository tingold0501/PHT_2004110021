package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;


public class CarTestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<Car> cars = new ArrayList<>();
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
                themXe();
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
                sapXepTheoDungTichXang();
                break;
                default: System.out.println("Lựa Chọn Không Hợp Lệ!!!");
            }
        }while(true);
        
    }
    public static void menu()
    {
        System.out.println("==================MENU==============");
        System.out.println("=1==============Thêm Xe=============");
        System.out.println("=2============Xoá Thông Tin=========");
        System.out.println("=3=========Hiển Thị Danh Sách=======");
        System.out.println("=4============Sửa Thông Tin=========");
        System.out.println("=5===Sắp Xếp Theo Dung Tích Xăng====");
        System.out.println("=0================THOÁT=============");
    }
    public static void themXe()
    {
        System.out.println("Nhập Số Lượng Xe Muốn Thêm:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Car c = new Car();
            c.nhapThongTin();
            cars.add(c);
        }
    }
    public static void xoaThongTin()
    {
        System.out.println("Nhập Dung Tích Xăng Muốn Xoá:");
        double dtx = sc.nextDouble();
        for (Car car : cars) {
            if(car.dungTichXang == dtx)
            cars.remove(car);
        }
    }
    public static void inThongTin()
    {
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n", "Tên Chủ Xe", "Hãng Sản Xuất","Dòng Xe","Giấy Phép","Dung Tích Xăng");
        for (Car car : cars) {
            car.xuatThongTin();
        }
    }
    public static void suaThongTin()
    {
        sc.nextLine();
        System.out.println("Nhập Dung Tích Xăng Muốn Sửa:");
        double dtx = sc.nextDouble();
        for (Car car : cars) {
            if(car.dungTichXang == dtx)
            {
                car.nhapThongTin();
            }
        }
    }
    public static void sapXepTheoDungTichXang()
    {
        Collections.sort(cars, new Comparator<Car>(){

            @Override
            public int compare(Car o1, Car o2) {
                if(o1.dungTichXang < o2.dungTichXang)
                {
                    return -1;
                }  
                return 1;
            } 
        });
    }
}
