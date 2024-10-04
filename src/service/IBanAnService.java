package service;

import entity.BanAn;


import java.util.List;

public interface IBanAnService {
    List<BanAn> getAllBanAn();

    void addBanAn(BanAn banAn);

    void updateBanAn(BanAn BanAn, int id);

    void deleteBanAn(int id);

    BanAn getBanAn(int id);

    List<BanAn> getAllBanAnWithoutBepTruong();

    List<BanAn> getAllBanAnWithBepTruong();
}
