package com.tinph2004110021.tuan03;

public class BookTestDrive {
    public static void main(String[] args) {
        Book book = new Book(25000);
        System.out.println("Gia: "+book.gia + " VND");
        book = new Book(25000, 35000);
        System.out.println("Gia: "+book.gia + " VND " +" Gia Ban: "+ book.giaBan + " VND");
        book = new Book(15000, 25000, 20);
        System.out.println("Gia: "+book.gia + " VND " +" Gia Ban: "+ book.giaBan + " VND " +"So Luong:"+ book.soLuong + " Quyen");
        book = new Book(25000, 35000, 20, "Phu Quoc");
        System.out.println("Gia: "+book.gia + " VND " +" Gia Ban: "+ book.giaBan + " VND " +"So Luong:"+ book.soLuong + " Quyen " +"Nha San Xuat: "+ book.nhaSx);
        book = new Book(15000, 25000, 30, "Phu Quoc", "Toan");
        System.out.println("Gia: "+book.gia + " VND " +" Gia Ban: "+ book.giaBan + " VND " +"So Luong:"+ book.soLuong +" Nha San Xuat: "+ book.nhaSx +" "+"Loai:"+ book.loai);
        book = new Book(15000, 20000, 4, "Phu Quoc", "SGK","05/01/2000" );
        System.out.println("Gia: "+book.gia + " VND " +" Gia Ban: "+ book.giaBan + " VND " +"So Luong:"+ book.soLuong +" "+"Nha San Xuat"+ book.nhaSx+ " " +"Loai:"+ book.loai+ " " +"Nam Xuat Ban:" +book.namXb);
    }
}
