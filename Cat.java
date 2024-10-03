public class Cat implements IAnimal{
    @Override
    public void run() {
        System.out.println("Toi dang chay");
    }

    @Override
    public void sleep() {
        System.out.println("Toi dang ngu");
    }

    @Override
    public void eat() {
        System.out.println("Toi dang an");
    }
}
