package com.tinph2004110021.tuan06;

import java.util.Scanner;

public class MangSanPham {

    String tenSp;
    float donGia, giamGia, thueNk;
    int index;
    static Scanner sc = new Scanner(System.in);
    static MangSanPham mSp = new MangSanPham();
    static MangSanPham[] lSp = new MangSanPham[mSp.index];
    MangSanPham()
    {

    }
    public void display()
    {
        System.out.println("==================Sản Phẩm=============");
        System.out.printf("%-20S %-20S %-20S %-20S\n","Tên Sản Phẩm","Đơn Giá","Giảm Giá","Thuế Sản Phẩm");
        System.out.printf("%-20S %-20.2f %-20.2f %-20.2f\n",tenSp, donGia,giamGia,thueNk);
    }
    public void countinue(){
        while(true)
        {
            System.out.println("Bạn Muốn Thêm Sản Phẩm Không[Y/N]:");
            sc.nextLine();
            String c = sc.nextLine();
            if(c.equals("Y"))
            {
                mSp.inPut();
            }
            else{
                break;
            }
        }
    }
    public void menu()
    {
        System.out.println("==================MENU==============");
        System.out.println("=1===========Nhâp Danh Sách=========");
        System.out.println("=2===============Sắp Xếp============");
        System.out.println("=3=============Tìm Và Xoá===========");
        System.out.println("=4======Xuất Giá Trị Trung Bình=====");
        System.out.println("=5========Thêm Ở Vị Trí Bất Kỳ======");
        System.out.println("=0================THOÁT=============");
    }
    public void inPut()
    {
        System.out.println("Nhập Tên Sản Phẩm:");
        tenSp = sc.nextLine();
        System.out.println("Nhập Đơn Giá Sản Phẩm:");
        donGia = sc.nextFloat();
        System.out.println("Nhập Giảm Giá Sản Phẩm:");
        giamGia = sc.nextFloat();
        System.out.println("Nhập Thuế Sản Phẩm:");
        thueNk = sc.nextFloat();
    }
    public void inPutList(MangSanPham lSp1[])
    {
        System.out.println("Enter Your Sum Numer:");
        mSp.index = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < mSp.index; i++)
        {
            lSp1[i] = new MangSanPham();
            lSp1[i].inPut();   
        }
    }
    public void sort(MangSanPham lSp[])
    {
        MangSanPham temp;
        for(int i = 0; i < mSp.index - 1; i++)
        {
            for(int j = i + 1; j < mSp.index; j++)
            {
                if(lSp[i].thueNk < lSp[i].thueNk)
                {
                    temp = lSp[i];
                    lSp[i] = lSp[j];
                    lSp[j] = temp;
                }
            }
        }
        for(int i = 0; i < mSp.index; i++)
        lSp[i].display();
    }
    public void findAndDelete(MangSanPham lSp[])
    {
        System.out.println("Nhập Tên Cần Xoá:");
        String name = sc.nextLine();
        for(int i = 0; i < mSp.index; i++){
            if(name.equals(lSp[i].tenSp)){
                for(int j = i; j < mSp.index - 1; j++){
                    lSp[j] = lSp[j + 1];
                }
            }
            System.out.println("Deleted!!!");
        }
        mSp.index--;
    }
    public void addIndex(MangSanPham lSp1[])
    {
        lSp = new MangSanPham[mSp.index + 1];
        System.out.println("Nhập Vị Trí Cần Thêm:");
        int n = sc.nextInt();
        for(int i =  mSp.index; i > index; i--){
            lSp[i] = lSp1[i - 1];
        }
        lSp[n] = new MangSanPham();
        lSp[n].inPut();
        for(int i = 0; i < n; i++){
            lSp[i] = lSp1[i];
        }
        mSp.index++;
        for (MangSanPham mangSanPham : lSp1) {
            mangSanPham.display();
            break;
        }
    }
    public void displayTb(MangSanPham lSp[]){
        double tb = 0;
        for(int i = 0; i < mSp.index; i++){
            tb = tb + lSp[i].donGia;
        }
        System.out.println("========"+ tb/(mSp.index)+"==========" );
    }

}
