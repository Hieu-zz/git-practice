package service.impl;

import entity.BanAn;
import service.IBanAnService;

import java.util.ArrayList;
import java.util.List;

public class BanAnService implements IBanAnService {
    List<BanAn> banAns = new ArrayList<>();

    public BanAnService() {
        banAns.add(new BanAn(1, "Ban 1", "Le Van Anh", null));
        banAns.add(new BanAn(2, "Ban 2", "Le Anh Tung", null));
        banAns.add(new BanAn(3, "Ban 3", "Le Van Bao", null));
        banAns.add(new BanAn(4, "Ban 4", "Le Van Tien", null));
        banAns.add(new BanAn(5, "Ban 5", "Le Van Hoang", null));
    }

    @Override
    public List<BanAn> getAllBanAn() {
        return banAns;
    }

    @Override
    public void addBanAn(BanAn banAn) {
        banAns.add(banAn);
        System.out.println("Them thanh cong ban an");
    }

    @Override
    public void updateBanAn(BanAn banAnUpdate, int id) {
        BanAn banAn = getBanAn(id);
        if (getBanAn(id) != null) {
            banAn.setName(banAnUpdate.getName());
            banAn.setGuestName(banAnUpdate.getGuestName());
            banAn.setBepTruong(banAnUpdate.getBepTruong());
            System.out.println("update thanh cong ban an");
        } else {
            System.out.println("Ban not found");
        }
    }

    @Override
    public void deleteBanAn(int id) {
        BanAn banAn = getBanAn(id);
        if (banAn != null) {
            banAns.remove(banAn);
            System.out.println("Xoa thanh cong ban an");
        } else {
            System.out.println("Ban not found");
        }
    }

    @Override
    public BanAn getBanAn(int id) {
        for (BanAn banAn : banAns) {
            if (banAn.getId() == id) {
                return banAn;
            }
        }
        return null;
    }

    @Override
    public List<BanAn> getAllBanAnWithoutBepTruong() {
        List<BanAn> banAnWithoutBepTruong = new ArrayList<>();
        for (BanAn b : banAns) {
            if (b.getBepTruong() == null) {
                banAnWithoutBepTruong.add(b);
            }
        }
        return banAnWithoutBepTruong;
    }

    @Override
    public List<BanAn> getAllBanAnWithBepTruong() {
        List<BanAn> banAnWithBepTruong = new ArrayList<>();
        for (BanAn b : banAns) {
            if (b.getBepTruong() != null) {
                banAnWithBepTruong.add(b);
            }
        }
        return banAnWithBepTruong;
    }


}
