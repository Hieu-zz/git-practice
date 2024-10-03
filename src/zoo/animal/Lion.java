package zoo.animal;

public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    public Lion() {
    }

    @Override
    void makeSound() {
        System.out.println("Gầm");
    }

    @Override
    public void getName() {
        super.getName();
    }

    @Override
    public void setName(String name) {
        super.setName(name);
    }
    public void hunt(){
        System.out.println("Săn");
    };
}
