package QuanLyBenhNhan.Model;

import java.util.Scanner;

public class BenhAnModel extends BenhNhanModel {
    private String tenBenhAn;
    private double tienVienPhi;

    public BenhAnModel(int i){
        this.nhapThongTin(i);
    }
    public void nhapThongTin(int i){
        super.nhapThongTin(i);
        Scanner scan = new Scanner(System.in);
        System.out.print("Nhập tên bệnh án: ");
        this.setTenBenhAn(scan.nextLine());
        System.out.print("Nhập số tiền viện phí: ");
        this.setTienVienPhi(Double.parseDouble(scan.nextLine()));
    }
    public void xuatThongTin(){
        super.xuatThongTin();
        System.out.println("Tên bệnh án: " + this.tenBenhAn + "\nViện phí: " +this.tienVienPhi);
    }
    public String getTenBenhAn() {
        return tenBenhAn;
    }
    public void setTenBenhAn(String tenBenhAn) {
        this.tenBenhAn = tenBenhAn;
    }
    public double getTienVienPhi() {
        return tienVienPhi;
    }
    public void setTienVienPhi(double tienVienPhi) {
        this.tienVienPhi = tienVienPhi;
    }
}
