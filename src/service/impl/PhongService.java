package service.impl;

import entity.NhanVien;
import entity.Phong;
import service.IPhongService;

import java.util.ArrayList;
import java.util.List;

public class PhongService implements IPhongService {
    List<Phong> listPhongs = new ArrayList<>();

    public PhongService() {
        listPhongs.add(new Phong(1, "P1", 2, null));
        listPhongs.add(new Phong(2, "P2", 3, null));
        listPhongs.add(new Phong(3, "P3", 4, null));
        listPhongs.add(new Phong(4, "P4", 5, null));
        listPhongs.add(new Phong(5, "P5", 6, null));
    }


    @Override
    public List<Phong> getAllPhongs() {
        return listPhongs;
    }

    @Override
    public void addPhong(Phong phong) {
        if (getPhong(phong.getId()) == null) {
            listPhongs.add(phong);
        } else {
            System.out.println("ID phong existed");
        }
    }

    @Override
    public void updatePhong(Phong phongUpdate, int id) {
        Phong phong = getPhong(id);
        if (phong != null) {
            phong.setTenPhong(phongUpdate.getTenPhong());
            phong.setFloor(phongUpdate.getFloor());
            phong.setNhanVien(phongUpdate.getNhanVien());
        } else {
            System.out.println("ID phong does not exist");
        }
    }

    @Override
    public void deletePhong(int id) {
        Phong phong = getPhong(id);
        if (phong != null) {
            listPhongs.remove(phong);
        } else {
            System.out.println("ID phong does not exist");
        }
    }

    @Override
    public Phong getPhong(int id) {
        for (Phong phong : listPhongs) {
            if (phong.getId() == id) {
                return phong;
            }
        }
        return null;
    }

    public List<Phong> getPhongTrong() {
        List<Phong> phongTrong = new ArrayList<>();
        for (Phong phong : listPhongs) {
            if (phong.getNhanVien() == null) {
                phongTrong.add(phong);
            }
        }
        return phongTrong;
    }

    public List<Phong> getPhongNotTrong() {
        List<Phong> phongExist = new ArrayList<>();
        for (Phong phong : listPhongs) {
            if (phong.getNhanVien() != null) {
                phongExist.add(phong);
            }
        }
        return phongExist;
    }

    public void updatePhongAfterDeleteNhanVien(int idNhanVien) {
        List<Phong> phongNotTrong = getPhongNotTrong();
        for (Phong phong : phongNotTrong) {
            if (phong.getNhanVien().getId() == idNhanVien) {
                phong.setNhanVien(null);
            }
        }
    }

    public void checkOutPhong(int idPhong) {
        for (Phong p : getPhongNotTrong()) {
            if (p.getId() == idPhong) {
                p.setNhanVien(null);
            }
        }
    }

    public void addNhanVienToPhong(int idPhong, NhanVien nhanVien) {
        Phong phong = getPhong(idPhong);
        if (phong != null) {
            phong.setNhanVien(nhanVien);
        } else {
            System.out.println("Phong khong ton tai");
        }
    }

}
