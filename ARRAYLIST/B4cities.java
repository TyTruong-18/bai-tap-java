package ARRAYLIST;

import java.util.ArrayList;

public class B4cities {

    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        cities.add("Da Nang");
        cities.add("London");
        cities.add("Paris");
        cities.add("Quy Nhon");
        cities.add("Tokyo");

        if (cities.contains("London")) {
            System.out.println("The List contains London");
        } else {
            System.out.println("The List does not contains London");
        }
    }
}
