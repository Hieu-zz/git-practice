package store.devices;

public abstract class Device {
    private String brand;
    private String model;

    abstract void showDetail();

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void see(){
        System.out.println(brand+ " " + model);
    }
}
