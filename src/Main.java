import controller.LichSuController;
import controller.NhanVienController;
import controller.PhongController;
import entity.NhanVien;
import entity.Phong;
import service.impl.LichSuService;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NhanVienController nhanVienController = new NhanVienController();
        PhongController phongController = new PhongController();
        LichSuController lichSuController = new LichSuController();

        int choose = 0;
        while (choose != 19) {
            System.out.println("========================MENU==========================");
            System.out.println("Choose feature: ");
            System.out.println("1.Get All Nhan Vien");
            System.out.println("2.Add nhan vien");
            System.out.println("3.Update Nhan vien");
            System.out.println("4.Delete nhan vien");
            System.out.println("=======================================");
            System.out.println("5.Get all Phong");
            System.out.println("6.Add phong");
            System.out.println("7.Update phong");
            System.out.println("8.Delete phong");
            System.out.println("9.Get phong trong");
            System.out.println("10.Get phong da co nguoi dat");
            System.out.println("11.Get nhan vien chua co phong");
            System.out.println("12.Checkout phong");
            System.out.println("13.Them nhan vien vao phong");
            System.out.println("14.Thong ke lich su");
            System.out.println("15.Thong ke by nhan vien");
            System.out.println("16.Thong ke by phong");
            System.out.println("17.Tim nhan vien ranh nhat");
            System.out.println("18.Tim phong ban nhat");
            System.out.println("19. Exit");
            System.out.println("=======================================================");
            System.out.print("Please enter your choice: ");
            choose = sc.nextInt();
            switch (choose) {
                case 1:
                    getAllNhanVien(nhanVienController);
                    break;
                case 2:
                    addNhanVien(nhanVienController, sc);
                    break;
                case 3:
                    updateNhanVien(nhanVienController, sc);
                    break;
                case 4:
                    deleteNhanVien(nhanVienController, phongController, sc);
                    break;
                case 5:
                    getAllPhong(phongController);
                    break;
                case 6:
                    addPhong(phongController, nhanVienController, lichSuController, sc);
                    break;
                case 7:
                    updatePhong(phongController, nhanVienController, sc);
                    break;
                case 8:
                    deletePhong(phongController, sc);
                    break;
                case 9:
                    getPhongTrong(phongController);
                    break;
                case 10:
                    getPhongNotTrong(phongController);
                    break;
                case 11:
                    getNhanVienChuaCoPhong(nhanVienController, phongController);
                    break;
                case 12:
                    traPhong(phongController, sc);
                    break;
                case 13:
                    addNhanToPhong(phongController, nhanVienController, lichSuController, sc);
                    break;
                case 14:
                    getAllLichSu(lichSuController);
                    break;
                case 15:
                    getLichSuByNhanVien(lichSuController, sc);
                    break;
                case 16:
                    getLichSuByPhong(lichSuController, sc);
                    break;
                case 17:
                    findNhanVienRanhNhat(lichSuController);
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        }

    }

    public static void getAllNhanVien(NhanVienController nhanVienController) {
        nhanVienController.getAllNhanVien().forEach(System.out::println);
    }

    public static void addNhanVien(NhanVienController nhanVienController, Scanner sc) {
        NhanVien nhanVien = new NhanVien();
        System.out.println("Fill the id:");
        nhanVien.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Fill the name:");
        nhanVien.setTenNhanVien(sc.nextLine());
        System.out.println("Fill the age:");
        nhanVien.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Fill the dob:");
        nhanVien.setDob(sc.nextLine());
        System.out.println("Fill the phone number:");
        nhanVien.setPhoneNumber(sc.nextLine());
        System.out.println("Fill the work as:");
        nhanVien.setWorkAs(sc.nextLine());
        nhanVienController.addNhanVien(nhanVien);
    }

    public static void updateNhanVien(NhanVienController nhanVienController, Scanner sc) {
        NhanVien nhanVien = new NhanVien();
        int id;
        System.out.println("Fill the id to update:");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Fill the new name:");
        nhanVien.setTenNhanVien(sc.nextLine());
        System.out.println("Fill the new age:");
        nhanVien.setAge(sc.nextInt());
        sc.nextLine();
        System.out.println("Fill the new dob:");
        nhanVien.setDob(sc.nextLine());
        System.out.println("Fill the new phone number:");
        nhanVien.setPhoneNumber(sc.nextLine());
        System.out.println("Fill the work as:");
        nhanVien.setWorkAs(sc.nextLine());
        nhanVienController.updateNhanVien(nhanVien, id);
    }

    public static void deleteNhanVien(NhanVienController nhanVienController, PhongController phongController, Scanner sc) {
        System.out.println("Fill the id to delete:");
        int id = sc.nextInt();
        sc.nextLine();
        nhanVienController.deleteNhanVien(id);
        phongController.updatePhongAfterDeleteNhanVien(id);
    }

    public static void getNhanVienChuaCoPhong(NhanVienController nhanVienController, PhongController phongController) {
        nhanVienController.getNhanVienChuaCoPhong(phongController.getPhongNotTrong()).forEach(System.out::println);
    }

    public static void getAllPhong(PhongController phongController) {
        phongController.getAllPhong().forEach(System.out::println);
    }

    public static void addPhong(PhongController phongController, NhanVienController nhanVienController, LichSuController lichSuController, Scanner sc) {
        System.out.println("Danh Sach Nhan Vien Chua Co Phong");
        getNhanVienChuaCoPhong(nhanVienController, phongController);
        System.out.println("--------------------------------------------");
        Phong phong = new Phong();
        System.out.println("Fill the id to add:");
        phong.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Fill the name to add:");
        phong.setTenPhong(sc.nextLine());
        System.out.println("Fill the floor to add:");
        phong.setFloor(sc.nextInt());
        sc.nextLine();
        System.out.println("Fill the idNhanVien to add:");
        NhanVien nhanVien = nhanVienController.getNhanVienById(sc.nextInt());
        phong.setNhanVien(nhanVien);
        sc.nextLine();
        phongController.addPhong(phong);
        lichSuController.addLichSu(phong, nhanVien);
    }

    public static void updatePhong(PhongController phongController, NhanVienController nhanVienController, Scanner sc) {
        Phong phong = new Phong();
        System.out.println("Fill the id phong to update:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Fill the new name phong to update:");
        phong.setTenPhong(sc.nextLine());
        System.out.println("Fill the new floor phong to update:");
        phong.setFloor(sc.nextInt());
        sc.nextLine();
        System.out.println("Fill the idNhanVien to update:");
        phong.setNhanVien(nhanVienController.getNhanVienById(sc.nextInt()));
        sc.nextLine();
        phongController.updatePhong(phong, id);
    }

    public static void deletePhong(PhongController phongController, Scanner sc) {
        System.out.println("Fill id phong to delete:");
        int id = sc.nextInt();
        sc.nextLine();
        phongController.deletePhong(id);
    }

    public static void getPhongTrong(PhongController phongController) {
        phongController.getPhongTrong().forEach(System.out::println);
    }

    public static void getPhongNotTrong(PhongController phongController) {
        List<Phong> phongList = phongController.getPhongNotTrong();
        for (Phong phong : phongList) {
            System.out.println("ID:" + phong.getId() + "| Ten Phong: " + phong.getTenPhong() + "| Floor:" + phong.getFloor() + "| Ten Nhan Vien:" + phong.getNhanVien().getTenNhanVien());
        }
    }

    public static void traPhong(PhongController phongController, Scanner sc) {
        System.out.println("Chon phong muon checkout");
        getPhongNotTrong(phongController);
        System.out.println("-------------------------------------");
        System.out.println("Fill idPhong muon checkout:");
        int id = sc.nextInt();
        sc.nextLine();
        phongController.checkoutPhong(id);
    }

    public static void addNhanToPhong(PhongController phongController, NhanVienController nhanVienController, LichSuController lichSuController, Scanner sc) {
        System.out.println("Chon phong muon them nhan vien:");
        int idPhong = sc.nextInt();
        sc.nextLine();
        System.out.println("Chon id nhan vien muon them vao: ");
        int idNhanVien = sc.nextInt();
        sc.nextLine();
        NhanVien nhanVien = nhanVienController.getNhanVienById(idNhanVien);
        phongController.addNhanVienToPhong(idPhong, nhanVien);
        Phong phong = phongController.getPhongById(idPhong);
        lichSuController.addLichSu(phong, nhanVien);
    }

    public static void getAllLichSu(LichSuController lichSuController) {
        lichSuController.getAllLichSu().forEach(System.out::println);
    }

    public static void getLichSuByNhanVien(LichSuController lichSuController, Scanner sc) {
        System.out.println("Nhap vao id nhan vien muon xem lich su:");
        int idNhanVien = sc.nextInt();
        sc.nextLine();
        lichSuController.getLichSuByNhanVien(idNhanVien).forEach(System.out::println);
    }

    public static void getLichSuByPhong(LichSuController lichSuController, Scanner sc) {
        System.out.println("Nhap vao id phong muon xem lich su:");
        int idPhong = sc.nextInt();
        sc.nextLine();
        lichSuController.getLichSuByPhong(idPhong).forEach(System.out::println);
    }

    public static void findNhanVienRanhNhat(LichSuController lichSuController){
        NhanVien nhanVienRanhNhat = lichSuController.getNhanVienRanhNhat();
        System.out.println(nhanVienRanhNhat);
    }

}