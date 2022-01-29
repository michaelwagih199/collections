package reflectionst;

import java.lang.reflect.*;


class Animal {

}

// put this class in different Dog.java file
class Dog extends Animal {

    public void display() {
        System.out.println("I am a dog.");
    }

    private void makeSound() {
        System.out.println("Bark Bark");
    }

}

// put this in Main.java file
class ReflectionApp {

    public static void main(String[] args) {

        try {
            int num[] = {1, 2, 3, 4};
            System.out.println(num[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }


        try {
            // create an object of Dog
            Dog d1 = new Dog();

            // create an object of Class
            // using getClass()
            Class obj = d1.getClass();

            // using object of Class to
            // get all the declared methods of Dog
            Method[] methods = obj.getDeclaredMethods();

            // create an object of the Method class
            for (Method m : methods) {

                // get names of methods
                System.out.println("Method Name: " + m.getName());

                // get the access modifier of methods
                int modifier = m.getModifiers();
                System.out.println("Modifier: " + Modifier.toString(modifier));

                // get the return types of method
                System.out.println("Return Types: " + m.getReturnType());
                System.out.println(" ");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}