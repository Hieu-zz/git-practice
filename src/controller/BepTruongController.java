package controller;

import entity.BepTruong;
import service.impl.BepTruongService;

import java.util.List;

public class BepTruongController {
    BepTruongService bepTruongService = new BepTruongService();

    public List<BepTruong> getAllBepTruong() {
        return bepTruongService.getAllBepTruong();
    }

    public BepTruong getBepTruongById(int id) {
        return bepTruongService.getBepTruong(id);
    }

    public void addBepTruong(BepTruong bepTruong) {
        bepTruongService.addBepTruong(bepTruong);
    }

    public void updateBepTruong(BepTruong bepTruong, int id) {
        bepTruongService.updateBepTruong(bepTruong, id);
    }

    public void deleteBepTruong(int id) {
        bepTruongService.deleteBepTruong(id);
    }

    public List<BepTruong> getAllByStatus(boolean status) {
        return bepTruongService.getAllBepTruongByStatus(status);
    }
}
