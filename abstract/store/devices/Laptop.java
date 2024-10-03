package store.devices;

public class Laptop extends Device{
    private int battery;


    public Laptop(int battery,String brand,String model) {
        super(brand,model);
        this.battery = battery;
    }

    @Override
    public void showDetail() {
        System.out.println("Brand: "+this.brand+" Model: "+this.model+" Pin hiện tại là: "+this.battery);
    }
}
