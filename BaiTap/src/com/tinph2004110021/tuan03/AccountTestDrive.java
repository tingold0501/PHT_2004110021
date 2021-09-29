package com.tinph2004110021.tuan03;

public class AccountTestDrive {
    public static void main(String[] args) {
        Account account = new Account("Pham Huynh Tin");
        System.out.println("Ho Ten: " + account.tenTk);
        account = new Account("Pham Huynh Tin", 1928282998);
        System.out.println("Ho Ten: "+ account.tenTk +" "+" So Tai Khoan: "+account.stk);
        account = new Account("Pham Huynh Tin",192882827, 23000);
        System.out.println("Ho Ten: "+account.tenTk + " "+" So Tai Khoan: " + account.stk + " "+" So Du: " + account.soDu + "VND");
    }
}
