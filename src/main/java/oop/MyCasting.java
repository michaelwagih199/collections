package oop;

public class MyCasting {

    public static Object obj;

    public static void main(String[] args)
            throws ClassNotFoundException
    {

        // returns the Class object for this class
        Class myClass = Class.forName("MyCasting");

        System.out.println("Class represented by myClass: "
                + myClass.toString());

        // Cast the object obj to object of myClass
        // using cast() method
        System.out.println("Object " + obj + " after cast "
                + "upon to class Test: "
                + myClass.cast(obj));
    }
}
