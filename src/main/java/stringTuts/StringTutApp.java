package stringTuts;

import java.util.Arrays;
import java.util.Locale;

public class StringTutApp {
    public static void main(String...args) {
//        String s1 = "Welcome to Java";
//        String s2 = s1;
//        String s3 = new String("Welcome to Java");
//        String s4 = "Welcome to Java";
////        Arrays.stream(countLetter("ababab")).forEach(System.out::println);
//
//        StringBuilder sb = new StringBuilder("MOON");
//        if (sb.reverse() == sb)
//            speak("palindrome");
//        else
//            speak("Not palindrome");

        for(String s : args){
            System.out.println(s);
        }
    }

    private static boolean isPalindromeString(String str) {
        int low = 0;
        int high = str.length() - 1;
        while (low < high) {
            if (str.charAt(low) != str.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }

    public static int[] countLetter(String str) {
        int[] counts = new int[26];
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i)))
                counts[str.charAt(i) - 'a']++;
        }
        return counts;
    }


    public static void speak(String str) {
        System.out.println(str);
    }
}


