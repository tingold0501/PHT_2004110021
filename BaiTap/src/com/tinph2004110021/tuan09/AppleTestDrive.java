package com.tinph2004110021.tuan09;

import java.util.Scanner;

public class AppleTestDrive {
    public static void main(String[] args) {
       LinkedListApple lApple = new LinkedListApple();
       Apple apple = new Apple();
       Scanner sc = new Scanner(System.in);
       apple.display();
       lApple.insertAt(new NodeApple(new Apple(12, "Yellow")), 10);
       lApple.insertAt(new NodeApple(new Apple(11, "Black")), 10);
       lApple.insertAt(new NodeApple(new Apple(10, "Blue")), 20);
       lApple.insertAt(new NodeApple(new Apple(7, "Pink")), 20);
       lApple.showData();
       System.out.println("Enter ID Want Find:");
       int id = sc.nextInt();
       lApple.searchAp(id);
       sc.nextLine();
       System.out.println("Nhập Cân Nặng Cần Tìm:");
       float w = sc.nextFloat();
       lApple.searchW(w);
       sc.nextLine();
       System.out.println("Nhập Màu Cần Tìm:");
       String color = sc.nextLine();
       lApple.searchCl(color);
    }
}
