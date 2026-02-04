package LEC9_InheritanceandPolymorphism.MethodOveriding;

public class Cat extends Animal {

    @Override
    void makeSound() {
        System.out.println("Meows meows");
    }

}
