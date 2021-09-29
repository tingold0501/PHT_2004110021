package com.tinph2004110021.tuan03;

public class Account {
    String tenTk;
    int stk;
    double soDu;
    Account(String name){
        tenTk = name;
    }
    Account(String ten, int sTk)
    {
        tenTk = ten;
        stk = sTk;
    }
    Account(String tenTK, int STK,double soDuTk )
    {
        tenTk = tenTK;
        stk = STK;
        soDu = soDuTk;
    }
}
