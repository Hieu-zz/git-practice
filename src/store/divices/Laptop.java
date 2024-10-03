package store.divices;

public class Laptop extends Device {
    private int battery;

    public Laptop(int battery, String model, String brand) {
        this.model = model;
        this.brand = brand;
        this.battery = battery;
    }

    @Override
    public void showDetail() {
        System.out.println("Laptop 1 with battery is: " + battery + " " + brand + " " + model);

    }
}
