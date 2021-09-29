package com.tinph2004110021.tuan03;

public class CarTestDrive {
    public static void main(String[] args) {
        Car car = new Car("Pham Huynh Tin");
        System.out.println("Ten Chu Xe: "+car.tenChuXe);
        car = new Car("Pham Huynh Tin", "Honda");
        System.out.println("Ten Chu Xe: "+car.tenChuXe + " " +" Hang San Xuat: "+ car.hangSx);
        car = new Car("Pham Huynh Tin", "Honda", "Sirus");
        System.out.println("Ten Chu Xe: "+car.tenChuXe + " " +" Hang San Xuat: "+ car.hangSx + " " +" Dong Xe: "+ car.dongXe);
        car = new Car("Pham Huynh Tin", "Honda", "Exciter", "Do Den");
        System.out.println("Ten Chu Xe: "+car.tenChuXe + " " +" Hang San Xuat: "+ car.hangSx + " " +" Dong Xe: "+ car.dongXe + " " + " Giay Phep: "+car.giayPhep);
        car = new Car("Pham Huynh Tin", "Honda", "Exciter", "Do Den", 25.5);
        System.out.println("Ten Chu Xe: "+car.tenChuXe + " " +" Hang San Xuat: "+ car.hangSx + " " +" Dong Xe: "+ car.dongXe + " " + " Giay Phep: "+ car.giayPhep+ " " +" Dung Tich Xang: "+ car.dungTichXang);
    }
}
