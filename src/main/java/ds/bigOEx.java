package ds;

import helpers.Customer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class bigOEx {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();

        //array of 10 numbers
        int arr[] = new int[]{12,56,76,89,100,343,21,234};
        findLargestAndSmallest(arr);

        long endTime = System.currentTimeMillis();
        long elapsed = endTime - startTime;
        System.out.println("Time In Ms:" + elapsed);

    }

    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) { // n
            sum += arr[i]; // o
        }
        //o(n)
        return sum;
    }

    public static int fib(int n) {
        if (n < 2) return n;
        return fib(n - 1) + fib(n - 2);
    }

    public static void findLargestAndSmallest(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];
        for(int i=1; i< arr.length; i++)
        {
            if(arr[i] > largest)
                largest = arr[i];
            else if (arr[i] < smallest)
                smallest = arr[i];

        }

        System.out.println("largest number" + smallest);
        System.out.println("smallest number" + smallest);
    }


}


