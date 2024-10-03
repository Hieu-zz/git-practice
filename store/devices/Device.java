package store.devices;

abstract class Device {
    protected String brand;
    protected String model;

    public Device() {
        this.brand = "";
        this.model = "";
    }

    public abstract void showDetail();
}
