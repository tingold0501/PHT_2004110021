package com.tinph2004110021.tuan06;

import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b,temp;
        System.out.println("\n\nNhập vào số a: ");
        a = sc.nextFloat();
        System.out.println("Nhập vào số b: ");
        b = sc.nextFloat();
        temp = a;
        a = b;
        b = temp;
        System.out.println("Sau khi hoán đổi\na = " + a + "\nb = " + b);
        System.out.println("---------------------------------");
    }
}


