package ARRAYLIST;

import java.util.ArrayList;

public class B8fruit {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pear");
        fruits.add("Mango");
        fruits.add("watermelon");

        ArrayList<String> copy = new ArrayList<>(fruits);

        System.out.println(fruits);
        System.out.println(copy);
    }
}
