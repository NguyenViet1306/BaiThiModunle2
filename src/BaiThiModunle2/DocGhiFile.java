package BaiThiModunle2;


import BaiThiModunle2.SanPham;

import java.io.*;
import java.util.ArrayList;

public class DocGhiFile {
    Menu menu = new Menu();
    ArrayList<SanPham> sanPhams = new ArrayList<>();
    public void ghiTapTin() {
        try {
            File file = new File("products.csv");
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));
            for (SanPham sanPham : sanPhams) {
                bufferedWriter.write(sanPham.getMaSanPham() + "," + sanPham.getTenSanPham() + "," + sanPham.getGia() + "," + sanPham.getSoLuong() + "," + sanPham.getMoTa() + "\n");
            }
            bufferedWriter.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void docTapTin() {
        ArrayList<SanPham> sanPhams1 = new ArrayList<>();
        try {
            File file = new File("products.csv");
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String giaTri;
            while ((giaTri = bufferedReader.readLine()) != null) {
                String[] strings = giaTri.split(",");
                SanPham sanPham = new SanPham(Integer.parseInt(strings[0]), strings[1], Integer.parseInt(strings[2]), Integer.parseInt(strings[3]), strings[4]);
                sanPhams1.add(sanPham);
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
        }
    }
}