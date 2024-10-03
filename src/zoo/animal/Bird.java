package zoo.animal;

public class Bird extends Animal{
    public Bird(String name) {
        super(name);
    }

    public Bird() {
    }

    @Override
    void makeSound() {
        System.out.println("Hót");
    }
    public void fly(){
        System.out.println("Bay");
    };
}
