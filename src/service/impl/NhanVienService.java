package service.impl;

import entity.NhanVien;
import entity.Phong;
import service.INhanVienService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class NhanVienService implements INhanVienService {
    List<NhanVien> listNhanVien = new ArrayList<>();
    PhongService phongService = new PhongService();


    public NhanVienService() {
        listNhanVien.add(new NhanVien(1, "Le Van Anh", 11, "2/5/2000", "09999999999", "Marketing"));
        listNhanVien.add(new NhanVien(2, "Le Van Tung", 11, "21/4/2001", "09999999999", "Sale"));
        listNhanVien.add(new NhanVien(3, "Le Van Bao", 11, "22/3/2002", "09999999999", "Sale"));
        listNhanVien.add(new NhanVien(4, "Le Van Ngoc", 11, "10/2/2003", "09999999999", "IT"));
        listNhanVien.add(new NhanVien(5, "Le Van Hoa", 11, "30/1/2004", "09999999999", "Marketing"));
    }

    @Override
    public List<NhanVien> getAllNhanViens() {
        return listNhanVien;
    }

    @Override
    public NhanVien getNhanVien(int id) {
        for (NhanVien nhanVien : listNhanVien) {
            if (nhanVien.getId() == id) {
                return nhanVien;
            }
        }
        return null;
    }

    @Override
    public void addNhanVien(NhanVien nhanVien) {
        if (getNhanVien(nhanVien.getId()) == null) {
            listNhanVien.add(nhanVien);
        } else {
            System.out.println("ID Nhan Vien existed");
        }

    }

    @Override
    public void updateNhanVien(NhanVien nhanVienUpdate, int id) {
        NhanVien nhanVien = listNhanVien.stream().filter(sv -> sv.getId() == id).findFirst().orElse(null);
        if (nhanVien != null) {
            nhanVien.setTenNhanVien(nhanVienUpdate.getTenNhanVien());
            nhanVien.setAge(nhanVienUpdate.getAge());
            nhanVien.setDob(nhanVienUpdate.getDob());
            nhanVien.setWorkAs(nhanVienUpdate.getWorkAs());
            nhanVien.setPhoneNumber(nhanVienUpdate.getPhoneNumber());
        } else {
            System.out.println("ID Nhan Vien Not Found !");
        }
    }

    @Override
    public void deleteNhanVien(int id) {
        NhanVien nhanVien = getNhanVien(id);
        if (nhanVien != null) {
            listNhanVien.remove(nhanVien);
        } else {
            System.out.println("ID Nhan Vien Not Found !");
        }
    }

    public List<NhanVien> getNhanVienChuaCoPhong(List<Phong> phongs) {
        List<NhanVien> listNhanVienChuaCoPhong = new ArrayList<>();
        for (NhanVien nv : listNhanVien) {
            for (Phong phong : phongs) {
                if (nv.getId() != phong.getNhanVien().getId()) {
                    listNhanVienChuaCoPhong.add(nv);
                }
            }
        }
        return listNhanVienChuaCoPhong;
    }
}
