package QuanLyBenhNhan.View;

import QuanLyBenhNhan.Controller.DanhSachBenhNhanController;

import java.util.Scanner;

public class QuanLyBenhNhanView {
    private DanhSachBenhNhanController danhSachBenhNhanController;

    public QuanLyBenhNhanView(){
        this.danhSachBenhNhanController = new DanhSachBenhNhanController();
        this.init();
    }
    public void init() {
        Scanner scan = new Scanner(System.in);
        while(true){
            this.menu();
            int select = Integer.parseInt(scan.nextLine());
            this.danhSachBenhNhanController.drawLine();
            if(select == 0)  break;
            switch (select){
                case 1:
                    this.danhSachBenhNhanController.nhapThongTin();
                    break;
                case 2:
                    if(this.danhSachBenhNhanController.getDanhSachBenhNhan().size() !=0 ){
                         this.danhSachBenhNhanController.sapXepTheoTuoiGiam();
                    } else {
                        System.out.println("Danh sách rỗng. Vui lòng thêm bệnh nhân");
                        this.danhSachBenhNhanController.drawLine();
                    }
                    break;
                case 3:
                    if(this.danhSachBenhNhanController.getDanhSachBenhNhan().size() !=0 ){
                        this.danhSachBenhNhanController.hienThiBenhNhanDuoiMuoiTuoi();
                    } else {
                        System.out.println("Danh sách rỗng. Vui lòng thêm bệnh nhân");
                        this.danhSachBenhNhanController.drawLine();
                    }
                    break;
                case 4:
                    if(this.danhSachBenhNhanController.getDanhSachBenhNhan().size() !=0 ){
                        this.danhSachBenhNhanController.benhNhanCoVienPhiCaoNhat();
                    } else {
                        System.out.println("Danh sách rỗng. Vui lòng thêm bệnh nhân");
                        this.danhSachBenhNhanController.drawLine();
                    }
                    break;
                default:
                    System.out.println("Sự lựa chọn không hợp lệ. Vui lòng chọn lại");
                    this.danhSachBenhNhanController.drawLine();
            }
        }
    }
    public void menu(){
        System.out.println("Hệ thống quản lý bệnh nhân.");
        System.out.print("1- Nhập 5 bệnh nhân.\n2- Sắp xếp các bệnh nhân theo tuổi giảm dần." +
                "\n3- Hiển thị các bênh nhân dưới 10 tuổi.\n4- Các bệnh nhân có viện phí cao nhất.\n0- Thoát hệ thống.\n==>Chọn:");
    }
}
