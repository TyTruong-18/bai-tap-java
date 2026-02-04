package LEC9_InheritanceandPolymorphism.MethodOveriding.Runtime;

public class PolymorphismEX {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();
        Dog dog = new Dog();
        dog.makeSound();
        Cat cat = new Cat();
        cat.makeSound();
    }
}
