package com.tinph2004110021.KtGiuaKy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppleTestDrive {
    static Scanner sc = new Scanner(System.in);
    static List<Apple> apples = new ArrayList<>();
    static Apple apple = new Apple();
    public static void main(String[] args) {
        do{
            apple.menu();
            System.out.println("Iuput Your Selection:");
            int n = sc.nextInt();
            switch(n){
                case 0:
                break;
                case 1:
                apple.createApple();
                break;
                case 2:
                apple.addApple();
                break;
                case 3:
                apple.find();
                break;
                case 4:
                apple.display();
                break;
                default:System.out.println("Error Selection!!!");
            }
        }while(true);
    }  

}
