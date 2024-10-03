package store.devices;

public abstract class Device {
    String brand;
    String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void hienthi(){
        System.out.println("Brand: "+brand +"; model: "+model);
    }

    public abstract void showDetail();
}
