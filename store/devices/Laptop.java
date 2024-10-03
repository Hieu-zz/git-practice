package store.devices;

public class Laptop extends Device {
    private final int battery;

    public Laptop(String brand, String model, int battery) {
        super(brand, model);
        this.battery = battery;
    }

    @Override
    public void showDetail() {
        System.out.println("Laptop brand: " + brand);
        System.out.println("Laptop model: " + model);
        System.out.println("Battery capacity: " + battery + " mAh");
    }
}
