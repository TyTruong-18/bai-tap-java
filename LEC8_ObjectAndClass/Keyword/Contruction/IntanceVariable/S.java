package LEC8_ObjectAndClass.Keyword.Contruction.IntanceVariable;

public class S {

    void m() {
        System.out.println("method in invoked");
    }

    void n() {
        this.m();
    }

    void p() {
        n();
    }

    public static void main(String[] args) {
        S s1 = new S();
        s1.p();
    }

}
