package service.impl;

import entity.BepTruong;
import service.IBepTruongService;

import java.util.ArrayList;
import java.util.List;

public class BepTruongService implements IBepTruongService {
    List<BepTruong> bepTruongs = new ArrayList<>();

    public BepTruongService() {
        bepTruongs.add(new BepTruong(1, "Hoang", "0999999999", true));
        bepTruongs.add(new BepTruong(2, "Tung", "0999999999", false));
        bepTruongs.add(new BepTruong(3, "Anh", "0999999999", true));
        bepTruongs.add(new BepTruong(4, "Bao", "0999999999", false));
        bepTruongs.add(new BepTruong(5, "Van", "0999999999", true));
    }

    @Override
    public List<BepTruong> getAllBepTruong() {
        return bepTruongs;
    }

    @Override
    public void addBepTruong(BepTruong bepTruong) {
        bepTruongs.add(bepTruong);
    }

    @Override
    public void updateBepTruong(BepTruong bepTruongUpdate, int id) {
        BepTruong bepTruong = getBepTruong(id);
        if (bepTruong != null) {
            bepTruong.setName(bepTruongUpdate.getName());
            bepTruong.setStatus(bepTruongUpdate.isStatus());
            bepTruong.setPhoneNumber(bepTruongUpdate.getPhoneNumber());
            System.out.println("Update thanh cong bep truong");
        } else {
            System.out.println("Bep truong not found");
        }
    }

    @Override
    public void deleteBepTruong(int id) {
        BepTruong bepTruong = getBepTruong(id);
        if (bepTruong != null) {
            bepTruongs.remove(bepTruong);
            System.out.println("Xoa thanh cong bep truong");
        } else {
            System.out.println("Bep Truong not found");
        }
    }

    @Override
    public BepTruong getBepTruong(int id) {
        for (BepTruong bepTruong : bepTruongs) {
            if (bepTruong.getId() == id) {
                return bepTruong;
            }
        }
        return null;
    }

    @Override
    public List<BepTruong> getAllBepTruongByStatus(boolean status) {
        List<BepTruong> bepTruongList = new ArrayList<>();

        for (BepTruong bepTruong : bepTruongs) {
            if (bepTruong.isStatus() == status) {
                bepTruongList.add(bepTruong);
            }
        }
        return bepTruongList;
    }
}
