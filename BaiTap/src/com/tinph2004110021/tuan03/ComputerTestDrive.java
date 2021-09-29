package com.tinph2004110021.tuan03;

public class ComputerTestDrive {
    public static void main(String[] args) {
        Computer computer = new Computer("MSI");
        System.out.println("Nha San Xuat: "+computer.nhaSx);
        computer = new Computer("MSI", "Win10");
        System.out.println("Nha San Xuat: "+computer.nhaSx + " " +" He Dieu Hanh: "+ computer.heDieuHanh);
        computer = new Computer("MSI", "Win10", "2000");
        System.out.println("Nha San Xuat: "+computer.nhaSx + " " +" He Dieu Hanh: "+ computer.heDieuHanh + " " +" Nam San Xuat: "+ computer.namSx);
        computer = new Computer("MSI", "Win10", "2000", "2020");
        System.out.println("Nha San Xuat: "+computer.nhaSx + " " +" He Dieu Hanh: "+ computer.heDieuHanh + " " +" Nam San Xuat: "+ computer.namSx+ " " +" Nam Bao Hanh: "+ computer.namBh);
        computer = new Computer("MSI", "Win10", "2000", "2020", "16GB", "VIP");
        System.out.println("Nha San Xuat: "+computer.nhaSx + " " +" He Dieu Hanh: "+ computer.heDieuHanh + " " +" Nam San Xuat: "+ computer.namSx+ " " +" Nam Bao Hanh: "+ computer.namBh + " " +" Ram: "+ computer.ram + " " +" CPU: "+ computer.cpu);
        computer = new Computer("MSI", "Win10", "2000", "2020", "16GB", "VIP", 150000);
        System.out.println("Nha San Xuat: "+computer.nhaSx + " " +" He Dieu Hanh: "+ computer.heDieuHanh + " " +" Nam San Xuat: "+ computer.namSx+ " " +" Nam Bao Hanh: "+ computer.namBh + " " +" Ram: "+ computer.ram + " " +" CPU: "+ computer.cpu + " " +" Gia: "+ computer.gia + " VND");

    }
}
