package QuanLyBenhNhan.Model;

import java.util.Scanner;

public class BenhNhanModel {
    private String hoTen, queQuan;
    private int namSinh;
    public BenhNhanModel(){
    }
    public void nhapThongTin(int i){
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tên bệnh nhân thứ " + (i + 1) + " : ");
        this.setHoTen(scan.nextLine());
        System.out.print("Nhập quê quán: ");
        this.setQueQuan(scan.nextLine());
        System.out.print("Nhập năm sinh: ");
        this.setNamSinh(Integer.parseInt(scan.nextLine()));
    }
    public void xuatThongTin(){
        System.out.println("Tên bệnh nhân: " + this.hoTen  +
                          "\nQuê quán: " + this.queQuan +
                          "\nTuổi: " + this.getTuoi()
        );
    }
    public int getTuoi() {
        return 2022 - this.namSinh;
    }

    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getQueQuan() {
        return queQuan;
    }
    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }
    public int getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }
}
