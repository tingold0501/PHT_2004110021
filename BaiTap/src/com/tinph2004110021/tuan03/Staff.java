package com.tinph2004110021.tuan03;

public class Staff {
    String tenNv, diaChi, boPhan,ngaySinh;
    double luong;
    Staff(String tNv)
    {
        tenNv = tNv;
    }
    Staff(String tNv1,String dC)
    {
        tenNv = tNv1;
        diaChi = dC;
    }
    Staff(String tNv2, String dC2, String bP)
    {
        tenNv = tNv2;
        diaChi = dC2;
        boPhan = bP;
    }
    Staff(String tNv3, String dC3, String bP1, String nS)
    {
        tenNv = tNv3;
        diaChi = dC3;
        boPhan = bP1;
        ngaySinh = nS;
    }
    Staff(String tNv4, String dC4, String bP2, String nS1, double l)
    {
        tenNv = tNv4;
        diaChi = dC4;
        boPhan = bP2;
        ngaySinh = nS1;
        luong = l;
    }
}
