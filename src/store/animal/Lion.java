package store.animal;

public class Lion extends Animal {


    public Lion() {
    }

    public Lion(String name) {
        this.name = name;
    }

//    public void getName(){
//        System.out.println("ten su tu la: "+name);
//    }

    public void hunt(){
        System.out.println("Lioc dang di san");
    }

    @Override
    public void makeSound() {
        System.out.println("Lion dang gam");
    }
}
