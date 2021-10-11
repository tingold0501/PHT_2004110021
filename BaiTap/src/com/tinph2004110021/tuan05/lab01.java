package com.tinph2004110021.tuan05;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab01 {
    static Scanner sc = new Scanner(System.in);
    static List<Double> db = new ArrayList<>();
    public static void main(String[] args) {
        while(true)
        {
            System.out.println("Nhập Số Thực:");
            Double x = sc.nextDouble();
            db.add(x);
            System.out.println("Nhập Thêm Không [Y/N]:");
            sc.nextLine();
            String n = sc.nextLine();
            if(n.equals("n"))
            break;
        }
        for (Double dbs : db) {
            System.out.println(dbs);
        }
    }
}
