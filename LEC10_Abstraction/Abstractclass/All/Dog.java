package LEC10_Abstraction.Abstractclass.All;

public class Dog extends Animal {

    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("barks barks");
    }

}
