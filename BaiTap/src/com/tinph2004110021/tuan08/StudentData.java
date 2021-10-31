package com.tinph2004110021.tuan08;

import java.util.Scanner;

import javax.swing.UIDefaults.ProxyLazyValue;

public class StudentData {
    String id;
    String name;
    int age;
    String classs;
    Scanner sc = new Scanner(System.in);
    public String getid() {
        return id;
    }
    public void setid(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getclasss() {
        return classs;
    }
    public void setclasss(String classs) {
        this.classs = classs;
    }
    public StudentData(String id, String name, int age, String classs) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.classs = classs;
    }
   private void input()
   {
        System.out.println("Enter Your ID:");
        id = sc.nextLine();
        System.out.println("Enter Your Name:");
        name = sc.nextLine();
        System.out.println("Enter Your Age:");
        age = sc.nextInt();
        System.out.println("Enter Your Class:");
        classs = sc.nextLine();
   }
   public void inputSd()
   {
       System.out.println("Enter Sum Number Student:");
       int n = sc.nextInt();
       for(int i = 0; i < n; i++)
       {
           input();
       }
   }

    
}
