package store.devices;

public class Laptop extends Device {
    final int battery = 100;

    public Laptop() {
        super();
    }

    public void showDetail() {
        System.out.println(battery);
    }
}
