package QuanLyBenhNhan.Model.Sort;

import QuanLyBenhNhan.Model.BenhNhanModel;

import java.util.Comparator;

public class SapXepGiamTheoTuoi implements Comparator<BenhNhanModel> {
    @Override
    public int compare(BenhNhanModel o1, BenhNhanModel o2) {
        if(o1.getTuoi() > o2.getTuoi()){
            return -1;
        } else return 1;
    }
}
