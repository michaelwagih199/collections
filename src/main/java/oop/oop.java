package oop;

class C {
    private static int p;

    public C() {
        this(0);
        System.out.println("C's no-arg constructor invoked");
    }

    public C(int p) {
        p = p;
    }
    public void m2() {
        C.p = 45;
    }
}

public class oop {
    public static void main(String... args) {

    }
}
