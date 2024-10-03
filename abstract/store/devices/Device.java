package store.devices;

public abstract class Device {
    public String brand;
    public String model;
    public abstract void showDetail();

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }
}
