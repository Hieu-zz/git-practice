package service.impl;

import controller.MonAnController;
import entity.MonAn;
import utils.IOFileUtils;

import java.io.IOException;
import java.util.List;

public class UltilService {
    IOFileUtils ioFileUtils = new IOFileUtils();

    public void xuatThucDon(List<MonAn> monAns) throws IOException {
        ioFileUtils.xuatThucDon(monAns);
        System.out.println("xuat thuc don thanh cong");
    }

    public void nhapMon(MonAnController monAnController) throws IOException {
        List<MonAn> listMonAn = ioFileUtils.nhapMon();
        for (MonAn monAn : listMonAn) {
            monAnController.addMonAn(monAn);
        }
        System.out.println("nhap mon thanh cong");
    }
}
