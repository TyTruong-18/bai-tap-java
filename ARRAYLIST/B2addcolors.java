package ARRAYLIST;

import java.util.Arrays;

import java.util.ArrayList;

public class B2addcolors {

    public static void main(String[] args) {
        ArrayList<String> color = new ArrayList<>();

        color.add("Red");
        color.add("Blue");
        color.add("Green");
        color.add("White");
        color.add("Black");

        color.set(1, "Yellow");
        System.out.println("Updated colors list: ");
        for (String colors : color) {
            System.out.println(colors);
        }
    }
}
