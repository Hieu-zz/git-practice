package store.devices;

public class laptop extends Device{
    public laptop(String brand, String model) {
        super(brand, model);
    }

    final void battery(){
       System.out.println("battery");
   }
    @Override


    public void showDetail() {

    }
}
