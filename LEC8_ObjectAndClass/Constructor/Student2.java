package LEC8_ObjectAndClass.Constructor;

public class Student2 {

    int id;
    String name;

    Student2() {
        System.out.println("default constructor is invoked");
    }

    Student2(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student2 e1 = new Student2(111, "Karan");
        Student2 e2 = new Student2(222, "Aryan");
        e1.display();
        e2.display();
    }
}
