package store.management;

import store.devices.*;

public class StoreManagement {
    public static void main(String[] args) {
        Laptop myLaptop = new Laptop("Dell", "XPS 13", 5000);
        myLaptop.showDetail();
    }
}
