package javaloop;

import java.util.ArrayList;
import java.util.List;

public class SinhVienService {
    List<SinhVien> sinhViens = new ArrayList<SinhVien>();

    public List<SinhVien> getAllSinhVien() {
        return sinhViens;
    }

    public SinhVienService() {
        sinhViens.add(new SinhVien(1, "Le van Anh", "12D", 18, "22/12/2000"));
        sinhViens.add(new SinhVien(2, "Le van bao", "12D", 18, "2/2/2001"));
        sinhViens.add(new SinhVien(3, "Le van tung", "12D", 18, "2/12/2002"));
        sinhViens.add(new SinhVien(4, "Le van tien", "12D", 18, "28/1/2003"));
        sinhViens.add(new SinhVien(5, "Le van hai", "12D", 18, "5/4/2005"));
    }

    public List<SinhVien> getSinhVienByNameOrID(String name, int id) {
        List<SinhVien> searchSinhViens = new ArrayList<>();
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getName().contains(name) || sinhVien.getId() == id) {
                searchSinhViens.add(sinhVien);
            }
        }
        return searchSinhViens;
    }

    public void createSinhVien(SinhVien sinhVien) {
        sinhViens.add(sinhVien);
    }

    public void updateSinhVien(SinhVien sinhVienUpdate, int id) {
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getId() == id) {
                sinhVien.setName(sinhVienUpdate.getName());
                sinhVien.setLop(sinhVienUpdate.getLop());
                sinhVien.setAge(sinhVienUpdate.getAge());
                sinhVien.setDob(sinhVienUpdate.getDob());
                break;
            }
        }
    }

    public SinhVien getById(int id) {
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getId() == id) {
                return sinhVien;
            }
        }
        return null;
    }

    public void deleteSinhVien(int id) {
        for (SinhVien sinhVien : sinhViens) {
            if (sinhVien.getId() == id) {
                sinhViens.remove(sinhVien);
                break;
            }
        }
    }
}
