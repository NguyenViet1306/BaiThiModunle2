package BaiThiModunle2;

import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        QuanLySanPham quanLySanPham = new QuanLySanPham();
        DocGhiFile docGhiFile = new DocGhiFile();
        Scanner input = new Scanner(System.in);
        int chon;
        do {
            System.out.println("CHUONG TRÌNH QUẢN LÝ SẢN PHẨM");
            System.out.println("1. Xem danh sách");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhập");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tìm sản phẩm có gái trị đắt nhất");
            System.out.println("7. Đọc từ File");
            System.out.println("8. Ghi từ File");
            System.out.println("0. Thoát");
            System.out.println("Chọn chức năng:: ");
            chon = input.nextInt();
            input.nextLine();
            switch (chon) {
                case 1:
                    quanLySanPham.HienThi();
                    input.nextLine();
                    System.out.println("1. Thêm sản phẩm");
                    System.out.println("2. Sửa sản phẩm");
                    System.out.println("3. Xóa sản phẩm");
                    int chon1 = Integer.parseInt(input.nextLine());
                    do {
                        switch (chon1) {
                            case 1:
                                quanLySanPham.ThemSanPham();
                                break;
                            case 2:
                                quanLySanPham.SuaSanPham();
                                break;
                            case 3:
                                quanLySanPham.XoaSanPham();
                                break;
                        }
                    } while (chon1 != 4);
                    break;
                case 2:
                    quanLySanPham.ThemSanPham();
                    break;
                case 3:
                    quanLySanPham.SuaSanPham();
                    break;
                case 4:
                    quanLySanPham.XoaSanPham();
                    break;
                case 5:

                    int chon2;
                    System.out.println("1. Tăng dần         2. Giảm dần");
                    System.out.println("---->Lựa chọn của bạn:");
                    chon2 = Integer.parseInt(input.nextLine());
                    if (chon2 == 1){
                       quanLySanPham.TangDan();
                    }
                    if (chon2 == 2){
                        quanLySanPham.GiamDan();
                    }
                    break;
                case 6:
                    quanLySanPham.SanPhamDatNhat();
                    break;
                case 7:
                    docGhiFile.docTapTin();
                    break;
                case 8:
                    docGhiFile.ghiTapTin();
                    break;
            }
        } while (chon != 9);
    }
}

