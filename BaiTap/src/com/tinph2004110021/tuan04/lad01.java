package com.tinph2004110021.tuan04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lad01 {
    static Scanner sc = new Scanner(System.in);
    static List<Double> doubles = new ArrayList<>();
    public static void main(String[] args) {
        nhapLieu();
        xuat();
    }
    public static void nhapLieu()
    {
        while(true)
        {
            System.out.println("Vui Lòng Nhập Số Thực:");
            Double x = sc.nextDouble();
            doubles.add(x);
            sc.nextLine();
            System.out.println("Nhập Tiếp Không:[Y/N]");
            String n = sc.nextLine();
            if(n.equals("N"))
            {
                break;
            }
        }
    }
    public static void xuat()
    {
        for (Double double1 : doubles) {
            System.out.println(double1);
        }
    }
}
