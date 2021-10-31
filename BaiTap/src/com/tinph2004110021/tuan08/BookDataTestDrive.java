package com.tinph2004110021.tuan08;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BookDataTestDrive {
    public static void main(String[] args) {
        LinkedList<BookData> list = new LinkedList<>();
        Queue<BookData> qBookDatas = new LinkedList<>();
        list.add(new BookData("SV1","Toán",20));
        list.add(new BookData("SV2","Toán",21));
        list.add(new BookData("SV3","Toán",22));
        list.add(new BookData("SV4","Toán",23));
        qBookDatas.add(new BookData("SV1","Toán",20));
        System.out.println(qBookDatas);
        Scanner input=new Scanner(System.in);
        System.out.print("Enter record no to display: ");
        String rec = input.next();
        for(BookData data:list){
            if(data.getId().equals(rec)){
            System.out.println(data.getId()+"\t"+data.getName()+"\t"+data.getPrice());
            }
        }
    }
}
