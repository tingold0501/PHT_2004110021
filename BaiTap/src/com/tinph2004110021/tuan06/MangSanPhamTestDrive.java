package com.tinph2004110021.tuan06;

import java.util.Scanner;

public class MangSanPhamTestDrive {
    static Scanner sc = new Scanner(System.in);
    static MangSanPham mSp = new MangSanPham();
    static MangSanPham[] lSp1 = new MangSanPham[mSp.index + 1];
    static int lc;
    public static void main(String[] args) {
        MangSanPham[] lSp = new MangSanPham[mSp.index];
        do{
            mSp.menu();
            System.out.println("Enter Your Selection:");
            lc = sc.nextInt();
            switch(lc){
                case 0:
                break;
                case 1:
                mSp.inPutList(lSp);
                break;
                case 2:
                mSp.sort(lSp);
                break;
                case 3:
                mSp.findAndDelete(lSp);
                break;
                case 4:
                mSp.displayTb(lSp);
                break;
                case 5:
                mSp.addIndex(lSp1);
                break;
                default:System.out.println("Lựa Chọn Không Hợp Lệ!!!!");
            }
        }while(true);
    }
}
