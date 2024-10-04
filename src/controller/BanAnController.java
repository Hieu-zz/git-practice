package controller;

import entity.BanAn;
import service.impl.BanAnService;

import java.util.List;

public class BanAnController {
    BanAnService banAnService = new BanAnService();

    public List<BanAn> getAllBanAn() {
        return banAnService.getAllBanAn();
    }

    public void addBanAn(BanAn banAn) {
        banAnService.addBanAn(banAn);
    }

    public BanAn getBanAnById(int id) {
        return banAnService.getBanAn(id);
    }

    public void updateBanAn(BanAn banAn, int id) {
        banAnService.updateBanAn(banAn, id);
    }

    public void deleteBanAn(int id) {
        banAnService.deleteBanAn(id);
    }

    public List<BanAn> getAllBanAnWithoutBepTruong() {
        return banAnService.getAllBanAnWithoutBepTruong();
    }

    public List<BanAn> getAllBanAnWithBepTruong() {
        return banAnService.getAllBanAnWithBepTruong();
    }

}
