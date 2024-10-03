public class Cat implements IAnimalAction{
    public Cat() {
    }

    @Override
    public void run() {
        System.out.println("fast");
    }

    @Override
    public void sleep() {
        System.out.println("Zzzzzz");
    }

    @Override
    public void eat() {
        System.out.println("No");
    }
}
