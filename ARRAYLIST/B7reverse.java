package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class B7reverse {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("Before reverse: " + list);
        Collections.reverse(list);
        System.out.println("After reverse: " + list);
    }
}
