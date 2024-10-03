package store.divice;

public class Laptop extends Device {
    private int battery;

    public Laptop(String brand, String model, int battery) {
        super(brand, model);
        this.battery = battery;
    }

    @Override
    public void showDetail() {
        System.out.println(this.brand + this.model + this.battery);
    }



}
