package exeption;

class Alpha {

    public void foo() {
        System.out.print("Afoo ");
    }
}


public class Beta extends Alpha {
    public void foo() {
        System.out.print("Bfoo ");
    }
    public void gr() {
        System.out.println("BBBBBBBBBBBB");
    }

    public static Object obj;

    public static void main(String[] args) throws ClassNotFoundException {
        Alpha a = new Beta();
        Beta b = (Beta) a;

        ((Beta) a).gr();
        b.foo();

        // returns the Class object for this class

    }
}


class Animal {
    public void eat() {
        System.out.println("animal Eat");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("Cat Eat");
    }

    public void mew() {
        System.out.println("Cat Mew");
    }
}

 class Dog extends Animal {

    public void eat() {
        System.out.println("Dog Eat");
    }
}

class A {
    public static void show() {
        System.out.println("Class A show() function");
    }
}

class B extends A {
    public static void show() {
        System.out.println("Class B show() function");
    }
}