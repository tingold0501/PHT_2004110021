package com.tinph2004110021.tuan03;

public class Book {
    double gia, giaBan;
    int soLuong;
    String nhaSx, loai;
    String namXb;
    Book(double giaCa)
    {
        gia = giaCa;
    }
    Book(double g, double gB)
    {
        gia = g;
        giaBan = gB;
    }
    Book(double g1, double gB1, int sL)
    {
        gia = g1;
        giaBan = gB1;
        soLuong = sL;
    }
    Book(double g2, double gB2, int sL1, String nSx)
    {
        gia = g2;
        giaBan = gB2;
        soLuong = sL1;
        nhaSx = nSx;
    }
    Book(double g3, double gB3, int sL2, String nSx1, String l)
    {
        gia = g3;
        giaBan = gB3;
        soLuong = sL2;
        nhaSx = nSx1;
        loai = l;
    }
    Book(double g4, double gB4, int sL3, String nSx2, String l1, String namXb1)
    {
        gia = g4;
        giaBan = gB4;
        soLuong = sL3;
        nhaSx = nSx2;
        loai = l1;
        namXb = namXb1;
        
    }
}
