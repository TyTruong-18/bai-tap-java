package ARRAYLIST;

import java.util.Arrays;

import java.util.ArrayList;

public class B3DoubleFor {

    public static void main(String[] args) {
        ArrayList<Double> prices = new ArrayList<>();
        prices.add(5.5);
        prices.add(6.5);
        prices.add(7.5);
        prices.add(8.5);
        prices.add(9.5);
        System.out.println("Cac so kep: ");

        for (int i = 0; i < prices.size(); i++) {
            System.out.println(prices.get(i));

        }
    }
}
