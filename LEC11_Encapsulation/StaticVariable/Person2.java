package LEC11_Encapsulation.StaticVariable;

public class Person2 {

    private String name;
    private static int count = 0;

    public Person2(String n) {
        name = n;
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Person2 p1 = new Person2("Trang");
        Person2 p2 = new Person2("Duong");
        Person2 p3 = new Person2("Luong");
    }

}
