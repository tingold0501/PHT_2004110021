package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class StaffTestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<Staff> staffs = new ArrayList<>();

    public static void main(String[] args) {
        do {
            menu();
            System.out.println("Nhập Lựa Chọn:");
            int n = sc.nextInt();
            switch(n)
            {
                case 0:
                break;
                case 1:
                themNhanVien();
                break;
                case 2:
                xoaNhanVien();
                break;
                case 3:
                inThongTin();
                break;
                case 4:
                suaThongTin();
                break;
                case 5:
                sapXepTheoLuong();
                break;
                default: System.out.println("Lựa Chọn Không Hợp Lệ!!!!!");
            }
        } while (true);
    }

    public static void menu() {
        System.out.println("==================MENU==============");
        System.out.println("=1===========Thêm Nhân Viên=========");
        System.out.println("=2============Xoá Thông Tin=========");
        System.out.println("=3=========Hiển Thị Danh Sách=======");
        System.out.println("=4============Sửa Thông Tin=========");
        System.out.println("=5=========Sắp Xếp Theo Lương=======");
        System.out.println("=0================THOÁT=============");
    }

    public static void themNhanVien() {
        System.out.println("Nhập Số Lượng Nhân Viên Muốn Thêm:");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Staff staff = new Staff();
            staff.nhapLieu();
            staffs.add(staff);
        }
    }

    public static void xoaNhanVien() {
        System.out.println("Nhập Tên Nhân Viên Muốn Xoá:");
        String name = sc.nextLine();
        for (Staff staff : staffs) {
            if (staff.tenNv == name) {
                staffs.remove(staff);
                System.out.println("Đã Xoá");
            } else {
                System.out.println("Có Vấn Đề Với Nhân Viên Này:");
            }
            break;
        }
    }

    public static void inThongTin() {
        System.out.printf("%-20S %-20S %-20S %-20S %-20S\n", "Tên Nhân Viên", "Địa Chỉ", "Bộ Phận", "Ngày Sinh", "Lương");
        for (Staff staff : staffs) {
            staff.xuatThongTin();
        }
    }

    public static void suaThongTin() {
        sc.nextLine();
        System.out.println("Nhập Tên Nhân Viên Muốn Sửa:");
        String name = sc.nextLine();
        for (Staff staff : staffs) {
            if (staff.tenNv == name) {
                staff.nhapLieu();
                System.out.println("Đã Sửa");
            } else {
                System.out.println("Không Thể Sửa Nhân Viên Này:");
            }
            break;
        }
    }

    public static void sapXepTheoLuong() {
        Collections.sort(staffs, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                if (o1.luong < o2.luong) {
                    return -1;
                }
                return 1;
            }
        });
        ;
    }

}
