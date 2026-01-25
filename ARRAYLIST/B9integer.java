package ARRAYLIST;

import java.util.ArrayList;
import java.util.Collections;

public class B9integer {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(8);
        list.add(12);
        list.add(1);
        list.add(2);
        System.out.println("int : " + list);
        System.out.println("Max: " + Collections.max(list));
        System.out.println("Min: " + Collections.min(list));
    }
}
