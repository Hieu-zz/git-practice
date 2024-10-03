package store.management;
import store.devices.laptop;
public class StoreManager {
    public static void main(String[] args) {
        laptop laptop = new laptop("100","aaa", "aaa");
        laptop.Showbattery();
        laptop.see();
    }
}
