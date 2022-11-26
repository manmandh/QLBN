package QuanLyBenhNhan.Controller;

import QuanLyBenhNhan.Model.BenhAnModel;
import QuanLyBenhNhan.Model.BenhNhanModel;
import QuanLyBenhNhan.Model.Sort.SapXepGiamTheoTuoi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class DanhSachBenhNhanController {
    private ArrayList<BenhNhanModel> danhSachBenhNhan;
    public DanhSachBenhNhanController(){
        this.danhSachBenhNhan = new ArrayList<BenhNhanModel>();
    }
    public ArrayList<BenhNhanModel> getDanhSachBenhNhan() {
        return danhSachBenhNhan;
    }
    public void nhapThongTin(){
        for(int i = 0 ; i < 5; i++){
            BenhNhanModel benhNhan = new BenhAnModel(i);
            danhSachBenhNhan.add(benhNhan);
            this.drawLine();
        }
    }
    public void sapXepTheoTuoiGiam(){
        Collections.sort(danhSachBenhNhan, new SapXepGiamTheoTuoi());
        for(BenhNhanModel BNM : danhSachBenhNhan){
            ((BenhAnModel)BNM).xuatThongTin();
            this.drawLine();
        }
    }
    public void hienThiBenhNhanDuoiMuoiTuoi(){
        for(BenhNhanModel BNM : danhSachBenhNhan){
            if(BNM.getTuoi() <= 10){
                ((BenhAnModel) BNM).xuatThongTin();
                this.drawLine();
            }
        }
    }
    public void benhNhanCoVienPhiCaoNhat(){
        double max = 0.0;
        for(BenhNhanModel BNM :danhSachBenhNhan){
            if(((BenhAnModel)BNM).getTienVienPhi() > max) max = ((BenhAnModel)BNM).getTienVienPhi();
        }
        for(int i = 0; i <danhSachBenhNhan.size(); i++){
            double tienVienPhiTungBenhNhan = ((BenhAnModel) danhSachBenhNhan.get(i)).getTienVienPhi();
            if(tienVienPhiTungBenhNhan == max ){
                ((BenhAnModel) danhSachBenhNhan.get(i)).xuatThongTin();
                this.drawLine();
            }
        }
    }
    public void drawLine(){
        for(int i = 0; i <= 30; i++){
            System.out.print("-");
        }
        System.out.println("-");
    }

}
