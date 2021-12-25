package ThiCuoiKy;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class HangHoaTestDrive {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Date ngayNhap = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        //String strDate = df.format(ngayNhap);
        ListHangHoa listHangHoa = new ListHangHoa();
        do{
            System.out.println("===========================MENU===========================");
            System.out.println("=1====================Thêm Hàng Hoá=======================");
            System.out.println("=2=====================Xoá Hàng Hoá=======================");
            System.out.println("=3=====================Sửa Hàng Hoá=======================");
            System.out.println("=4===================Sắp Xếp Hàng Hoá=====================");
            System.out.println("=5==================Thống Kê Hàng Hoá=====================");
            System.out.println("=6===============Xem Danh Sách Hàng Hoá===================");
            System.out.println("=7==================Tìm Kiếm Hàng Hoá=====================");
            System.out.println("=0=========================THOÁT==========================");
            System.out.println("Mời Nhập Lựa Chọn:");
            int lc = sc.nextInt();
            switch(lc)
            {
                case 0:
                    break;
                case 1:
                String loaiHh = null;
                sc.nextLine();
                System.out.println("Nhập Tên Hàng:");
                String ten = sc.nextLine();
                System.out.println("Nhập Số Lượng:");
                int soLuong = sc.nextInt();
                System.out.println("Nhập Giá:");
                float gia = sc.nextFloat();
                System.err.println("Nhập Loại Hàng [1: Thực Phẩm; 2: Sành Sứ; 3: Điện Máy]");
                int l = sc.nextInt();
                switch(l)
                {
                    case 1: loaiHh = "Thực Phẩm";
                    break;
                    case 2: loaiHh = "Sành Sứ";
                    break;
                    case 3: loaiHh = "Điện Máy";
                    break;
                    default: System.out.println("Loại Không Hợp Lệ!!!");
                    break;
                }
                sc.nextLine();
                try {
                    System.out.println("Nhập Ngày Vào Kho [dd/MM/yyyy]");
                    ngayNhap = df.parse(sc.nextLine());
                } catch (Exception e) {
                    System.out.println("Ngày Không Hợp Lệ!!!!");
                }
                HangHoa hangHoa = new HangHoa(soLuong, ten, loaiHh, gia, ngayNhap);
                listHangHoa.ThemHangHoa(hangHoa);
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                listHangHoa.HienThiHangHoa();
                    break;
                case 7:
                
                    break;
                default:
                System.out.println("Lựa Chọn Không Hợp Lệ!!!");
                System.out.println("Vui Lòng Nhập Lại Lựa Chọn");
                break;
            }
        }while(true);
    }
}
