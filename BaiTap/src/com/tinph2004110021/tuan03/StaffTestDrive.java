package com.tinph2004110021.tuan03;

public class StaffTestDrive {
    public static void main(String[] args) {
        Staff staff = new Staff("Pham Huynh Tin");
        System.out.println("Ten Nhan Vien: "+staff.tenNv);
        staff = new Staff("Pham Huynh Tin", "Phu Quoc");
        System.out.println("Ten Nhan Vien: "+staff.tenNv + " " +" Dia Chi: "+ staff.diaChi);
        staff = new Staff("Pham Huynh Tin", "Phu Quoc", "Phuc Vu");
        System.out.println("Ten Nhan Vien: "+staff.tenNv + " " +" Dia Chi: "+ staff.diaChi + " " +" Bo Phan: "+ staff.boPhan);
        staff = new Staff("Pham Huynh Tin", "Phu Quoc", "Phuc Vu","2000");
        System.out.println("Ten Nhan Vien: "+staff.tenNv + " " +" Dia Chi: "+ staff.diaChi + " " +" Bo Phan: "+ staff.boPhan + " " +" Nam Sinh: "+ staff.ngaySinh);
        staff = new Staff("Pham Huynh Tin", "Phu Quoc", "Phuc Vu","2000", 200000);
        System.out.println("Ten Nhan Vien: "+staff.tenNv + " " +" Dia Chi: "+ staff.diaChi + " " +" Bo Phan: "+ staff.boPhan + " " +" Nam Sinh: "+ staff.ngaySinh + " " + " Luong: "+staff.luong + " VND");
    }
}
