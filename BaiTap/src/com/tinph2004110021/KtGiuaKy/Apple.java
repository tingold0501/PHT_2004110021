package com.tinph2004110021.KtGiuaKy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Apple {
    int ID;
    float weight;
    String color;
    Scanner sc = new Scanner(System.in);
    static List<Apple> lApple = new ArrayList<>();
    public Apple(int iD, float weight, String color) {
        ID = iD;
        this.weight = weight;
        this.color = color;
    }
    Apple()
    {

    }
   public void menu(){
       System.out.println("==============MENU=============");
       System.out.println("=1=======Create Apple==========");
       System.out.println("=2=========Add Apple===========");
       System.out.println("=3========Find Apple===========");
       System.out.println("=4======Display Apple==========");
       System.out.println("==============EXIT=============");
   }
   public void createApple()
   {
       System.out.println("Iuput Sum Apple:");
       int n = sc.nextInt();
       for(int  i = 0; i < n; i++)
       {
           Apple apple = new Apple();
           if(n >= 0)
           {
            apple.input();
            lApple.add(apple);
           }
           else
           {
               System.out.println("Number Error!!!");
           }
           
       }
   }
   public void input()
   {
       System.out.println("Input ID Apple:");
       ID = sc.nextInt();
       System.out.println("Input Weight Apple:");
       weight = sc.nextFloat();
       sc.nextLine();
       System.out.println("Input Color Apple:");
       color = sc.nextLine();
   }
   public void displayApple()
   {
        System.out.printf("%-20S %-20S %-20S\n","id applle", "weight apple", "color apple");
   }
   public void display()
   {
        System.out.println("==========Apple========");
       for (Apple apple : lApple) {
            apple.displayApple();
            System.out.printf("%-20d %-20.2f %-20S\n",ID, weight,color);
       }
   }
   public void addApple()
   {
       System.out.println("Input Sum Number Apple:");
       int n = sc.nextInt();
       for(int  i = 0; i < n; i++)
       {
           Apple apple = new Apple();
           input();
           lApple.add(apple);
       }
   }
   public void find()
   {
       System.out.println("Input Color You Want Find:");
       String name = sc.nextLine();
       for (Apple apple : lApple) {
           if(name.equals(apple.color)){
               apple.display();
           }
       }
   }
}
