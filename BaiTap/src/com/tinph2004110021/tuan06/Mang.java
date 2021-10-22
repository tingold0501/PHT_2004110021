package com.tinph2004110021.tuan06;

import java.util.Scanner;

public class Mang {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        nhapMang();
    }
    public static void nhapMang()
    {
        int [] a;
        int n, x;
        System.out.println("Nhập Vào Số Lượng Phần Tử Trong Mãng:");
        n = sc.nextInt();
        a = new int [n+1];
        for(int i = 0; i < a.length;i++)
        {
            System.out.println("Nhập Phần Tử Thứ A[" + i + "]");
            a[i] = sc.nextInt();
        }
        System.out.println("Nhập Phần Tử Cần Chèn:");
        x = sc.nextInt();
        chenMang(a, x);
    }
    public static void chenMang(int [] a, int x)
    {
        if(a[0] > x)
        {
                for(int i = a.length - 1; i > 0; i--)
                a[i] = a[i-1];
            a[0] = x;
        }
        else if(a[a.length - 2] < x) a[a.length -1] = x;
        else
        {
            int index = 0;
            for(int i = 0; i < a.length -1; i++)
            if(a[i] > x){
                index = 1;
                break;
            }
                for(int i = a.length - 1; i > index; i--)
                a[i] = a[i -1];
            a[index] = x;
        }
        hienThi(a);
    }
    public static void hienThi(int[] a){
        for(int x:a)
            System.out.println(x +" ");
        System.out.println(" ");
    }
    
}
