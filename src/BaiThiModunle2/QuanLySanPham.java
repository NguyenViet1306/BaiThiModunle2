package BaiThiModunle2;

import sun.util.resources.cldr.ta.TimeZoneNames_ta;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class QuanLySanPham {
    ArrayList<SanPham> sanPhams = new ArrayList<>();
    Scanner input = new Scanner(System.in);

    private boolean kiemTraMaSanPham(int maSanPham) {
        for (SanPham sanPham : sanPhams) {
            if (maSanPham == sanPham.getMaSanPham()) {
                return true;
            }
        }
        return false;
    }

    public SanPham TaoSanPham() {
        try {
            System.out.println("Nhập mã sản phẩm:");
            int maSanPham = Integer.parseInt(input.nextLine());
            System.out.println("Nhập tên sản phẩm:");
            String tenSanPham = input.nextLine();
            System.out.println("Nhập giá của sản phẩm:");
            int gia = Integer.parseInt(input.nextLine());
            System.out.println("Nhập số lượng sản phẩm:");
            int soLuong = Integer.parseInt(input.nextLine());
            System.out.println("Mô Tả sản phẩm:");
            String moTa = input.nextLine();
            return new SanPham(maSanPham, tenSanPham, gia, soLuong, moTa);
        } catch (Exception e){
            System.out.println("Nhập sai định dạng nhập lại");
        }
        return  null;
    }

    public void ThemSanPham() {
        SanPham sanPham = TaoSanPham();
        sanPhams.add(sanPham);
    }

    public void HienThi() {
        for (SanPham sanPham : sanPhams) {
            System.out.println(sanPham);
        }
    }

    public void SuaSanPham() {
        System.out.println("Nhập mã sản phẩm cần sửa:");
        int ma = Integer.parseInt(input.nextLine());
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getMaSanPham() == ma) {
                System.out.println("Nhập thông tin sản phẩm mới");
            System.out.println("Nhập mã sản phẩm");
            int maSanPham = Integer.parseInt(input.nextLine());
            System.out.println("Nhập tên sản phẩm:");
            String tenSanPham = input.nextLine();
            System.out.println("Nhập giá của sản phẩm:");
            int gia = Integer.parseInt(input.nextLine());
            System.out.println("Nhập số lượng sản phẩm");
            int soLuong = Integer.parseInt(input.nextLine());
            System.out.println("Nhập mô tả sản phẩm:");
            String moTa = input.nextLine();
            sanPhams.get(i).setMaSanPham(maSanPham);
            sanPhams.get(i).setTenSanPham(tenSanPham);
            sanPhams.get(i).setGia(gia);
            sanPhams.get(i).setSoLuong(soLuong);
            sanPhams.get(i).setMoTa(moTa);
        }
    }
        if (!kiemTraMaSanPham(ma)) {
            System.out.println("Nhập lại mã sản phẩm");

        }}

    public void XoaSanPham() {
        try {
            System.out.println("Nhập mã sản phẩm muốn xóa: ");
            int  maSanPham = Integer.parseInt(input.nextLine());
            for (int i = 0; i < sanPhams.size(); i++) {
                if (sanPhams.get(i).getMaSanPham() ==  maSanPham) {
                    sanPhams.remove(sanPhams.get(i));
                }else {
                    System.out.println("Mã sản phẩm không tồn tại!");
                }
            }
        }catch (Exception e){
            System.out.println("Nhap sai dinh dang, nhap lai");
        }

    }



    Comparator<SanPham> compareUp = new Comparator<SanPham>() {
                @Override
                public int compare(SanPham o1, SanPham o2) {
                    return (o1.getGia() - o2.getGia());
                }
            } ;

            Comparator<SanPham> compareDown = new Comparator<SanPham>() {
                @Override
                public int compare(SanPham o1, SanPham o2) {
                    return (o2.getGia() - o1.getGia());
                }
            } ;


            // Sắp xếp tăng dần
            public void TangDan(){
                System.out.println("Sản phẩm được sắp xếp tăng dần ...");
                sanPhams.sort(compareUp);
                HienThi();
            }

            public void GiamDan(){
                    System.out.println("Sản phẩm được sắp xếp giảm dần ...");
                sanPhams.sort(compareDown);
                HienThi();
            }



    public void SanPhamDatNhat(){
        double giaDatNhat = sanPhams.get(0).getGia();
        for (int i = 0; i < sanPhams.size(); i++) {
            if (sanPhams.get(i).getGia() > giaDatNhat){
                giaDatNhat = sanPhams.get(i).getGia();
                System.out.println(sanPhams.get(i));
            }
        }
    }

}
