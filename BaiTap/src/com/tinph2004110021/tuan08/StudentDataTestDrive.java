package com.tinph2004110021.tuan08;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class StudentDataTestDrive {
    public static void main(String[] args) {
        LinkedList<StudentData> list = new LinkedList<StudentData>();
        Stack<StudentData> studentDatas = new Stack<>();
        list.add(new StudentData("SV1","Huỳnh Tín",20,"K14DCPM01"));
        list.add(new StudentData("SV2","Huỳnh Tín",21,"K14DCPM01"));
        list.add(new StudentData("SV3","Huỳnh Tín",22,"K14DCPM01"));
        // list.removeFirst();
        studentDatas.push(new StudentData("SV1","Huỳnh Tín",20,"K14DCPM01"));
        studentDatas.pop();
        System.out.println(studentDatas);
        Scanner input=new Scanner(System.in);
        System.out.print("Enter record no to display: ");
        String rec = input.next();
        for(StudentData data:list){
            if(data.getid().equals(rec)){
            System.out.println(data.getid()+"\t"+data.getName()+"\t"+data.getAge()+"\t"+data.getclasss());
            }
        }
    }
    
}
