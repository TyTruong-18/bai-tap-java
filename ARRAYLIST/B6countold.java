
package ARRAYLIST;
import java.util.ArrayList;
import java.util.Random;



public class B6countold {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rd = new Random();
        int chan = 0, le = 0;

        for (int i = 0; i < 15; i++) {
            list.add(rd.nextInt(50) + 1);
        }

        for (int x : list) {
            if (x % 2 == 0)
                chan++;
            else
                le++;
        }

        System.out.println(list);
        System.out.println("even : " + chan);
        System.out.println("odd: " + le);
    }
}
    

