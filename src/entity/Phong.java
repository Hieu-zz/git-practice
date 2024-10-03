package entity;

public class Phong {
    int id;
    String tenPhong;
    int floor;
    NhanVien nhanVien;

    public Phong() {
    }

    public Phong(int id, String tenPhong, int floor, NhanVien nhanVien) {
        this.id = id;
        this.tenPhong = tenPhong;
        this.floor = floor;
        this.nhanVien = nhanVien;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    @Override
    public String toString() {
        return "Phong{" +
                "id=" + id +
                ", tenPhong='" + tenPhong + '\'' +
                ", floor=" + floor +
                ", nhanVien=" + nhanVien +
                '}';
    }
}
