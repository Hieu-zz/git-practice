package controller;

import entity.MonAn;
import service.impl.MonAnService;
import service.impl.UltilService;

import java.io.IOException;
import java.util.List;

public class UtllsController {
    UltilService ultilService = new UltilService();

    public void xuatThucDon(List<MonAn> monAns) throws IOException {
        ultilService.xuatThucDon(monAns);
    }

    public void NhapMonAn(MonAnController monAnController) throws IOException {
        ultilService.nhapMon(monAnController);
    }
}
