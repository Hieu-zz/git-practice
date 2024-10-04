package test;
public static void main(String[] args) {
    ArrayList<SinhVien> sinhViens = new ArrayList<>();
    try (Scanner input = new Scanner(System.in)) {
        while (true) {
            int luaChon;
            System.out.print("\n1. Hien thi danh sach sinh vien\n"
                    + "2. Them sinh vien\n"
                    + "3. Sua thong tin sinh vien\n"
                    + "4. Xoa sinh vien\n"
                    + "5. Tim kiem sinh vien\n"
                    + "0. Thoat\n"
                    + "Nhap lua chon: ");
            do {
                luaChon = input.nextInt();
                if (luaChon < 0 || luaChon > 5) {
                    System.out.println("Lua chon khong hop le!");
                }
            } while (luaChon < 0 || luaChon > 5);
            switch (luaChon) {
                case 1:
                    System.out.println("\nDanh sach sinh vien");
                    for (var sinhVien : sinhViens) {
                        System.out.println(sinhVien.toString());
                    }
                    break;
                case 2:
                    System.out.print("Nhap ma sinh vien: ");
                    int id = input.nextInt();
                    input.nextLine();
                    System.out.print("Nhap ho ten sinh vien: ");
                    String hoTen = input.nextLine();
                    System.out.print("Nhap lop: ");
                    String lop = input.nextLine();
                    System.out.print("Nhap tuoi sinh vien: ");
                    int tuoi = input.nextInt();
                    input.nextLine();
                    System.out.print("Nhap ngay thang nam sinh: ");
                    String ngaySinh = input.nextLine();
                    sinhViens.add(new SinhVien(id, hoTen, lop, tuoi, ngaySinh));
                    break;
                case 3:
                    System.out.print("Nhap ma sinh vien can sua thong tin: ");
                    int idSinhVien = input.nextInt();
                    for (var sinhVien : sinhViens) {
                        if (sinhVien.getId() == idSinhVien) {
                            input.nextLine();
                            System.out.print("Nhap ho ten sinh vien: ");
                            String _hoTen = input.nextLine();
                            System.out.print("Nhap lop: ");
                            String _lop = input.nextLine();
                            System.out.print("Nhap tuoi sinh vien: ");
                            int _tuoi = input.nextInt();
                            input.nextLine();
                            System.out.print("Nhap ngay thang nam sinh: ");
                            String _ngaySinh = input.nextLine();
                            sinhVien.setHoTen(_hoTen);
                            sinhVien.setLop(_lop);
                            sinhVien.setTuoi(_tuoi);
                            sinhVien.setNgaySinh(_ngaySinh);
                        }
                    }
                    System.out.println("Da sua thong tin cua sinh vien co ma " + idSinhVien);
                    break;
                case 4:
                    System.out.print("Nhap ma sinh vien can xoa: ");
                    int xoaTheoId = input.nextInt();
                    sinhViens.removeIf(sinhVien -> sinhVien.getId() == xoaTheoId);
                    System.out.println("Da xoa sinh vien co ma sinh vien " + xoaTheoId);
                    break;
                case 5:
                    System.out.print("\n1. Tim kiem theo id\n"
                            + "2. Tim kiem theo ten\n"
                            + "Nhap lua chon: ");
                    int luaChonTimKiem;
                    do {
                        luaChonTimKiem = input.nextInt();
                        if (luaChonTimKiem < 1 || luaChonTimKiem > 2) {
                            System.out.println("Lua chon khong hop le!");
                        }
                    } while (luaChonTimKiem < 1 || luaChonTimKiem > 2);
                    switch (luaChonTimKiem) {
                        case 1:
                            System.out.print("Nhap id can tim: ");
                            int timKiemTheoId = input.nextInt();
                            for (var sinhVien : sinhViens) {
                                if (sinhVien.getId() == timKiemTheoId) {
                                    System.out.println(sinhVien.toString());
                                }
                            }
                            break;
                        case 2:
                            System.out.print("Nhap ten can tim: ");
                            input.nextLine();
                            String timKiemTheoTen = input.nextLine();
                            for (var sinhVien : sinhViens) {
                                if (sinhVien.getHoTen().equalsIgnoreCase(timKiemTheoTen)) {
                                    System.out.println(sinhVien.toString());
                                }
                            }
                            break;

                        default:
                            break;
                    }
                    break;
                default:
                    break;
            }
            if (luaChon == 0) {
                break;
            }
        }
    }
}