package store.management;

import store.divices.Laptop;

public class StoreManager {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(1,"i10","Dell");
        laptop.showDetail();
    }
}
