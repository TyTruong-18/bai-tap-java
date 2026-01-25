package ARRAYLIST;

import java.util.ArrayList;
import java.util.Random;

public class B5random {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();

        for (int i = 0; i < 10; i++) {
            list.add(rd.nextInt(100) + 1);
        }
        System.out.println("Original List: ");

        System.out.println(list);
        list.remove(3);
        System.out.println("updated list after removing index 3: ");
        System.out.println(list);
    }
}
