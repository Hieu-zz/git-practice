import controller.BanAnController;
import controller.BepTruongController;
import controller.MonAnController;
import controller.UtllsController;
import entity.BanAn;
import entity.BepTruong;
import entity.MonAn;
import service.impl.MonAnService;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        BanAnController banAnController = new BanAnController();
        BepTruongController bepTruongController = new BepTruongController();
        MonAnController monAnController = new MonAnController();
        UtllsController utllsController = new UtllsController();

        int choose = 0;
        while (choose != 21) {
            System.out.println("========================MENU==========================");
            System.out.println("Choose feature: ");
            System.out.println("1.Get All Mon an");
            System.out.println("2.Add mon an");
            System.out.println("3.Update mon an");
            System.out.println("4.Delete mon an");
            System.out.println("-----------------------------------");
            System.out.println("5.Get all bep truong");
            System.out.println("6.Add bep truong");
            System.out.println("7.Update bep truong");
            System.out.println("8.Delete bep truong");
            System.out.println("-----------------------------------");
            System.out.println("9.Get all ban an");
            System.out.println("10.add ban an");
            System.out.println("11.sua ban an");
            System.out.println("12.xoa ban an");
            System.out.println("-------------------------------------");
            System.out.println("13.Get all ban an chua co bep truong");
            System.out.println("14.Get all ban an da co bep truong");
            System.out.println("-----------------------------------");
            System.out.println("15.Get all mon an theo danh muc");
            System.out.println("16.Get mon an ban chay nhat");
            System.out.println("------------------------------------");
            System.out.println("17.Get bep truong theo trang thai");
            System.out.println("-------------------------------------");
            System.out.println("18.Goi mon");
            System.out.println("--------------------------------------");
            System.out.println("19.Xuat thuc don");
            System.out.println("20.Nhap mon");
            System.out.println("21.Exit");
            System.out.println("=======================================================");
            System.out.print("Please enter your choice: ");
            choose = sc.nextInt();
            sc.nextLine();
            switch (choose) {
                case 1:
                    getAllMonAns(monAnController);
                    break;
                case 2:
                    themMonAn(monAnController, sc);
                    break;
                case 3:
                    updateMonAn(monAnController, sc);
                    break;
                case 4:
                    deleteMonAn(monAnController, sc);
                    break;
                case 5:
                    getAllBepTruong(bepTruongController);
                    break;
                case 6:
                    addBepTruong(bepTruongController, sc);
                    break;
                case 7:
                    updateBepTruong(bepTruongController, sc);
                    break;
                case 8:
                    deleteBepTruong(bepTruongController, sc);
                    break;
                case 9:
                    getAllBanAn(banAnController);
                    break;
                case 10:
                    addBanAn(banAnController, bepTruongController, sc);
                    break;
                case 11:
                    updateBanAn(banAnController, bepTruongController, sc);
                    break;
                case 12:
                    deleteBanAn(banAnController, sc);
                    break;
                case 13:
                    getAllBanAnWithoutBepTruong(banAnController);
                    break;
                case 14:
                    getAllBanAnWithBepTruong(banAnController);
                    break;
                case 15:
                    getAllMonAnTheoDanhMuc(monAnController, sc);
                    break;
                case 16:
                    getMonAnBanChayNhat(monAnController);
                    break;
                case 17:
                    getAllBepTruongByStatus(bepTruongController, sc);
                    break;
                case 18:
                    goiMon(monAnController, sc);
                    break;
                case 19:
                    xuatThucDon(utllsController, monAnController);
                    break;
                case 20:
                    nhapMon(utllsController, monAnController);
                    break;
                case 21:
                    break;
                default:
                    System.out.println("Vui lòng chọn lại");
            }
        }
    }

    public static void getAllMonAns(MonAnController monAnController) {
        monAnController.getAllMonAn().forEach(System.out::println);
    }

    public static void themMonAn(MonAnController monAnController, Scanner sc) {
        System.out.println("Nhap vao id mon an: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten mon an:");
        String tenMonAn = sc.nextLine();
        System.out.println("Nhap vao nguyen lieu:");
        String nguyenLieu = sc.nextLine();
        System.out.println("Nhap vao danh muc:");
        String danhMuc = sc.nextLine();
        MonAn newMonAn = new MonAn(id, tenMonAn, nguyenLieu, danhMuc, 0);
        monAnController.addMonAn(newMonAn);
    }

    public static void updateMonAn(MonAnController monAnController, Scanner sc) {
        MonAn monAn = new MonAn();
        System.out.println("Nhap vao id mon an muon sua: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten moi cua mon an:");
        monAn.setName(sc.nextLine());
        System.out.println("Nhap vao nguyen lieu:");
        monAn.setIngredients(sc.nextLine());
        System.out.println("Nhap vao danh muc:");
        monAn.setCategory(sc.nextLine());
        System.out.println("Nhap vao so luong ban");
        monAn.setCount(sc.nextInt());
        sc.nextLine();
        monAnController.updateMonAn(monAn, id);
    }

    public static void deleteMonAn(MonAnController monAnController, Scanner sc) {
        System.out.println("Nhap vao id mon an: ");
        int id = sc.nextInt();
        sc.nextLine();
        monAnController.deleteMonAn(id);
    }


    public static void getAllBepTruong(BepTruongController bepTruongController) {
        bepTruongController.getAllBepTruong().forEach(System.out::println);
    }

    public static void addBepTruong(BepTruongController bepTruongController, Scanner sc) {
        System.out.println("Nhap vao id bep truong: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten bep truong:");
        String tenBepTruong = sc.nextLine();
        System.out.println("Nhap vao phoneNumber:");
        String phoneNumber = sc.nextLine();
        System.out.println("Nhap vao trang thai:");
        boolean trangThai = sc.nextBoolean();
        BepTruong newBepTruong = new BepTruong(id, tenBepTruong, phoneNumber, trangThai);
        bepTruongController.addBepTruong(newBepTruong);
    }

    public static void updateBepTruong(BepTruongController bepTruongController, Scanner sc) {
        BepTruong bepTruong = new BepTruong();
        System.out.println("Nhap vao id bep truong can sua: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten moi cua bep truong:");
        bepTruong.setName(sc.nextLine());
        System.out.println("Nhap vao phoneNumber:");
        bepTruong.setPhoneNumber(sc.nextLine());
        System.out.println("Nhap vao trang thai:");
        bepTruong.setStatus(sc.nextBoolean());
        bepTruongController.updateBepTruong(bepTruong, id);

    }

    public static void deleteBepTruong(BepTruongController bepTruongController, Scanner sc) {
        System.out.println("Nhap vao bep truong muon xoa:");
        int id = sc.nextInt();
        bepTruongController.deleteBepTruong(id);
    }

    public static void getAllBanAn(BanAnController banAnController) {
        banAnController.getAllBanAn().forEach(System.out::println);
    }

    public static void addBanAn(BanAnController banAnController, BepTruongController bepTruongController, Scanner sc) {
        BanAn newBanAn = new BanAn();
        System.out.println("Nhap vao id ban an:");
        newBanAn.setId(sc.nextInt());
        sc.nextLine();
        System.out.println("Nhap vao ten an:");
        newBanAn.setName(sc.nextLine());
        System.out.println("Nhap vao ten khach hang:");
        newBanAn.setGuestName(sc.nextLine());
        System.out.println("Nhap vao id chef:");
        int id = sc.nextInt();
        sc.nextLine();
        BepTruong bepTruong = bepTruongController.getBepTruongById(id);
        newBanAn.setBepTruong(bepTruong);
        banAnController.addBanAn(newBanAn);
    }

    public static void updateBanAn(BanAnController banAnController, BepTruongController bepTruongController, Scanner sc) {
        BanAn banAn = new BanAn();
        System.out.println("Nhap vao id ban an muon cap nhat:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao ten moi cua ban:");
        banAn.setName(sc.nextLine());
        System.out.println("Nhap vao ten khach hang moi:");
        banAn.setGuestName(sc.nextLine());
        System.out.println("Nhap vao id chef:");
        int idBepTruong = sc.nextInt();
        sc.nextLine();
        BepTruong bepTruong = bepTruongController.getBepTruongById(idBepTruong);
        banAn.setBepTruong(bepTruong);
        banAnController.updateBanAn(banAn, id);
    }

    public static void deleteBanAn(BanAnController banAnController, Scanner sc) {
        System.out.println("Nhap vao ban an muon xoa:");
        int id = sc.nextInt();
        sc.nextLine();
        banAnController.deleteBanAn(id);
    }

    public static void getAllBanAnWithoutBepTruong(BanAnController banAnController) {
        banAnController.getAllBanAnWithoutBepTruong().forEach(System.out::println);
    }

    public static void getAllBanAnWithBepTruong(BanAnController banAnController) {
        banAnController.getAllBanAnWithBepTruong().forEach(System.out::println);
    }

    public static void getAllMonAnTheoDanhMuc(MonAnController monAnController, Scanner sc) {
        System.out.println("Nhap vao danh muc: ");
        String danhMuc = sc.nextLine();
        monAnController.getMonAnByDanhMuc(danhMuc).forEach(System.out::println);
    }

    public static void getMonAnBanChayNhat(MonAnController monAnController) {
        System.out.println(monAnController.getMonAnBanChayNhat());
    }

    public static void getAllBepTruongByStatus(BepTruongController bepTruongController, Scanner sc) {
        System.out.println("Nhap vao trang thai:");
        boolean status = sc.nextBoolean();
        bepTruongController.getAllByStatus(status).forEach(System.out::println);
    }

    public static void goiMon(MonAnController monAnController, Scanner sc) {
        System.out.println("Nhap vao id mon muon goi:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap vao so luong:");
        int soLuong = sc.nextInt();
        sc.nextLine();
        monAnController.goiMon(id, soLuong);
    }

    public static void xuatThucDon(UtllsController utllsController, MonAnController monAnController) throws IOException {
        utllsController.xuatThucDon(monAnController.getAllMonAn());
    }

    public static void nhapMon(UtllsController utllsController,MonAnController monAnController) throws IOException {
        utllsController.NhapMonAn(monAnController);
    }
}