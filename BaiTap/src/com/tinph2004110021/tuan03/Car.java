package com.tinph2004110021.tuan03;

public class Car {
    String tenChuXe, hangSx, dongXe, giayPhep;
    double dungTichXang;
    Car(String tCx)
    {
        tenChuXe = tCx;
    }
    Car(String tCx2, String hSx)
    {
        tenChuXe = tCx2;
        hangSx = hSx;
    }
    Car(String tCx3, String hSx1, String dx)
    {
        tenChuXe = tCx3;
        hangSx = hSx1;
        dongXe = dx;
    }
    Car(String tCx4, String hSx2, String dX2, String gP)
    {
        tenChuXe = tCx4;
        hangSx = hSx2;
        dongXe = dX2;
        giayPhep = gP;
    }
    Car(String tCx5, String hSx3, String dX3, String gP1, double dtx)
    {
        tenChuXe = tCx5;
        hangSx = hSx3;
        dongXe = dX3;
        giayPhep = gP1;
        dungTichXang = dtx;
    }
}
