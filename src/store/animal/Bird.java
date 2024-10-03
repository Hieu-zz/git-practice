package store.animal;

public class Bird extends Animal {

    public Bird() {
    }

    public Bird(String name) {
        this.name = name;
    }


//    public void getName(){
//        System.out.println("ten chim la: "+name);
//    }


    @Override
    public void makeSound() {
        System.out.println("chim keo quac quac");
    }

    public void fly() {
        System.out.println("Chim dang bay");
    }
}
