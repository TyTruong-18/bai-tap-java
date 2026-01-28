package ASSIGNMENT7;

import java.util.Scanner;

public class BAI2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String[] words = str.split(" ");
        System.out.println("Number of words: " + words.length);
    }

}
