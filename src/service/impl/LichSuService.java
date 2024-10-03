package service.impl;

import entity.LichSu;
import entity.NhanVien;
import entity.Phong;
import service.ILichSuService;

import java.util.*;
import java.util.stream.Collectors;

public class LichSuService implements ILichSuService {
    List<LichSu> listLichSu = new ArrayList<LichSu>();

    @Override
    public List<LichSu> getAlls() {
        return listLichSu;
    }

    @Override
    public void add(Phong phong, NhanVien nhanVien) {
        LichSu lichSu = new LichSu(phong, nhanVien);
        listLichSu.add(lichSu);
    }

    public List<LichSu> getLichSuByIdNhanVien(int idNhanVien) {
        List<LichSu> lichSuByNhanVien = new ArrayList<>();
        for (LichSu lichSu : listLichSu) {
            if (lichSu.getNhanVien().getId() == idNhanVien) {
                lichSuByNhanVien.add(lichSu);
            }
        }
        return lichSuByNhanVien;
    }

    public List<LichSu> getLichSuByPhong(int idPhong) {
        List<LichSu> lichSuByPhong = new ArrayList<>();
        for (LichSu lichSu : listLichSu) {
            if (lichSu.getPhong().getId() == idPhong) {
                lichSuByPhong.add(lichSu);
            }
        }
        return lichSuByPhong;
    }

    public NhanVien findNhanVienRanhRoi() {
        Map<NhanVien, Integer> countByNhanVien = new HashMap<>();

        for (LichSu lichSu : listLichSu) {
            NhanVien nhanVien = lichSu.getNhanVien();
            countByNhanVien.put(nhanVien, countByNhanVien.getOrDefault(nhanVien, 0) + 1);
        }

        NhanVien nhanVienRanhNhat = null;
        int soLan = 100;

        for (Map.Entry<NhanVien, Integer> entry : countByNhanVien.entrySet()) {
            if (entry.getValue() < soLan) {
                soLan = entry.getValue();
                nhanVienRanhNhat = entry.getKey();
            }
        }
        return nhanVienRanhNhat;
    }

    


}
