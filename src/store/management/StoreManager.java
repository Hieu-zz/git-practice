package store.management;

import store.divice.Laptop;

public class StoreManager {
    public static void main(String[] args ){
        Laptop laptop = new Laptop( "lap" ,"top", 2);
        laptop.showDetail();
    }
}
