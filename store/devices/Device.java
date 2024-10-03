package store.devices;

public abstract class Device {
    protected String brand;
    protected String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void showDetail();
}
