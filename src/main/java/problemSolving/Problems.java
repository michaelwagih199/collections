package problemSolving;

import java.util.*;

public class Problems {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // This method reads the number provided using keyboard
        int num = scan.nextInt();
        // Closing Scanner after the use
        scan.close();
        if (num < 100) {
            if (num % 2 != 0) {
                System.out.println("Weird");
            } else if (num % 2 == 0 && 2 <= num && num <= 5) {
                System.out.println("Not Weird");
            } else if (num % 2 == 0 && 6 <= num && num <= 20) {
                System.out.println("Weird");
            } else if (num % 2 == 0 && num >= 20) {
                System.out.println("Not Weird");
            }
        } else {
            System.out.println("Please number From 1to 100");
        }


    }
}
