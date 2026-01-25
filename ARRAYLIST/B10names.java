package ARRAYLIST;

import java.util.ArrayList;
import java.util.HashSet;

public class B10names {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Uyen");
        names.add("Thao");
        names.add("Ngan");
        names.add("Truc");
        names.add("Ngan");
        System.out.println("names: "+names);
        System.out.println("after deletion");
        ArrayList<String> result = new ArrayList<>(new HashSet<>(names));

        System.out.println(result);
    }
}
