package store.devices;

public class laptop extends Device{
    final String battery ;

    public String getBattery() {
        return battery;
    }

    public laptop(String brand, String model, String battery) {
        super(brand, model);
        this.battery = battery;
    }

    @Override
    void showDetail() {

    }

    public void Showbattery(){
        System.out.println(battery);

    }

}
