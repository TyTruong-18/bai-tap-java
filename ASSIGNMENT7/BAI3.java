package ASSIGNMENT7;

import java.util.Scanner;

public class BAI3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String str = sc.nextLine();
        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.print(str.charAt(i));

        }
        System.out.println();
    }
}
