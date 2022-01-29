package collections;

import java.util.*;

public class MyApp {
    public static void main(String[] args) {
        int[] myArray = new int[200];
        Object[] students = new Object[50];
        students[0] = new Book();

        /**
         * limitations of arrays
         * 1 - fixed size
         * 2- hemogeneous data type
         * 3- limitations of api and methods
         */

        List list = new LinkedList();

        List<Book> books = new ArrayList<Book>();

        List.of("michal","wagih","boules").forEach(System.out::println);


    }
}

class Student {

}

class Book {
}

