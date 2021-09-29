package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class AccountTestDrive {
    static List<Account> accounts = new ArrayList<>();
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
                    themThongTin();
                break;
                case 2:
                    xoaThongTin();
                break;
                case 3:
                    hienThi();
                break;
                case 4:
                    suaThongTin();
                break;
                case 5:
                    sapXepTheoSoDu();
                break;
                default:
                System.out.println("Lựa Chọn Không Hợp Lệ!!!");
            }
        }while(true);
    }
    private static void menu()
    {
        System.out.println("==================MENU==============");
        System.out.println("=1============Thêm Account==========");
        System.out.println("=2============Xoá Thông Tin=========");
        System.out.println("=3=========Hiển Thị Danh Sách=======");
        System.out.println("=4============Sửa Thông Tin=========");
        System.out.println("=5=========Sắp Xếp Theo Số Dư=======");
        System.out.println("=0================THOÁT=============");
    }
    private static void suaThongTin()
    {
        System.out.println("Nhập Số Tài Khoản Cần Sửa:");
        int soTk = sc.nextInt();
        for (Account account : accounts) {
            if(account.stk == soTk)
            {
                account.nhapThongTin();
            }
        }
    }
    private static void themThongTin()
    {
        System.out.println("Bạn Muốn Thêm Bao Nhiêu Account:");
        int n = sc.nextInt();
        for(int i = 0; i < n; i++)
        {
            Account ac = new Account();
            ac.nhapThongTin();
            accounts.add(ac);
        }
    }
    private static void hienThi()
    {
        System.out.println("=================Thông Tin Account=================");
        System.out.printf("%-20S %-20S %-20S\n","Tên Tài Khoản","Số Tài Khoản","Số Dư Tài Khoản");
        for (Account account : accounts) {
            account.xuatThongTin();
        }
    }
    private static void xoaThongTin()
    {
        System.out.println("Nhập Số Tài Khoản Cần Xoá:");
        int stK = sc.nextInt();
        for (Account account : accounts) {
            if(account.stk == stK){
                accounts.remove(account);
                break;
            }
        }
    }
    private static void sapXepTheoSoDu()
    {
        Collections.sort(accounts, new Comparator<Account>(){
            @Override
            public int compare(Account a1, Account a2)
            {
                if(a1.soDu < a2.soDu)
                {
                    return -1;
                }
                return 1;
            }
            
        });;
    }
    
}
