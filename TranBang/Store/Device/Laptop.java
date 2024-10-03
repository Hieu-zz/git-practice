package org.example.store.devices;

public class Laptop extends Device{
    final String battery;

    public Laptop(String battery,String brand,String model) {
        this.battery = battery;
        this.brand=brand;
        this.model=model;
    }

    @Override
    public void showDetail() {
        System.out.println(battery);
        System.out.println(brand);
        System.out.println(model);
    }
}
