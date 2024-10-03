package entity;

public class LichSu {
    public NhanVien NhanVien;
    public Phong Phong;

    public LichSu() {
    }

    public LichSu(entity.Phong phong, entity.NhanVien nhanVien) {
        Phong = phong;
        NhanVien = nhanVien;
    }

    public entity.NhanVien getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(entity.NhanVien nhanVien) {
        NhanVien = nhanVien;
    }

    public entity.Phong getPhong() {
        return Phong;
    }

    public void setPhong(entity.Phong phong) {
        Phong = phong;
    }

    @Override
    public String toString() {
        return "LichSu{" +
                "NhanVien=" + NhanVien +
                ", Phong=" + Phong +
                '}';
    }
}
