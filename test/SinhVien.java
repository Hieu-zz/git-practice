package test;
public class SinhVien {
    private int id;
    private String hoTen;
    private String lop;
    private int tuoi;
    private String ngaySinh;

    public SinhVien(int id, String hoTen, String lop, int tuoi, String ngaySinh) {
        this.id = id;
        this.hoTen = hoTen;
        this.lop = lop;
        this.tuoi = tuoi;
        this.ngaySinh = ngaySinh;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    @Override
    public String toString() {
        return "SinhVien [id=" + id + ", hoTen=" + hoTen + ", lop=" + lop + ", tuoi=" + tuoi + ", ngaySinh=" + ngaySinh
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((hoTen == null) ? 0 : hoTen.hashCode());
        result = prime * result + ((lop == null) ? 0 : lop.hashCode());
        result = prime * result + tuoi;
        result = prime * result + ((ngaySinh == null) ? 0 : ngaySinh.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SinhVien other = (SinhVien) obj;
        if (id != other.id)
            return false;
        if (hoTen == null) {
            if (other.hoTen != null)
                return false;
        } else if (!hoTen.equals(other.hoTen))
            return false;
        if (lop == null) {
            if (other.lop != null)
                return false;
        } else if (!lop.equals(other.lop))
            return false;
        if (tuoi != other.tuoi)
            return false;
        if (ngaySinh == null) {
            if (other.ngaySinh != null)
                return false;
        } else if (!ngaySinh.equals(other.ngaySinh))
            return false;
        return true;
    }

}
