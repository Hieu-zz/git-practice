package controller;

import entity.LichSu;
import entity.NhanVien;
import entity.Phong;
import service.impl.LichSuService;

import java.util.List;

public class LichSuController {
    LichSuService lichSuService = new LichSuService();

    public List<LichSu> getAllLichSu() {
        return lichSuService.getAlls();
    }

    public void addLichSu(Phong phong, NhanVien nhanVien) {
        lichSuService.add(phong, nhanVien);
    }

    public List<LichSu> getLichSuByNhanVien(int idNhanVien) {
        return lichSuService.getLichSuByIdNhanVien(idNhanVien);
    }

    public List<LichSu> getLichSuByPhong(int idPhong) {
        return lichSuService.getLichSuByPhong(idPhong);
    }

    public NhanVien getNhanVienRanhNhat(){
       return lichSuService.findNhanVienRanhRoi();
    }
}
