package LEC8_ObjectAndClass.Overloading.DaTaType;

public class Promotion {

    public void display(int a) {
        System.out.println("integer: " + a);
    }    

    public void display(double a) {
        System.out.println("Double: " + a);
    }

    public static void main(String[] args) {
        Promotion obj = new Promotion();
        obj.display(5);
        obj.display(5.0);
        obj.display(5L);
    }
}
