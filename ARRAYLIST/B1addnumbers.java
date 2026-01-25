package ARRAYLIST;

import java.util.Arrays;

import java.util.ArrayList;

public class B1addnumbers {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 10; i++) {
            numbers.add(i);

        }
        System.out.print("Elements in the ArrayList: ");
        System.out.println(numbers);

    }

}
