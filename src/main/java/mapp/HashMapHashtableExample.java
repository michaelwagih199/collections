package mapp;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;

public class HashMapHashtableExample {
    public static void main(String[] args) {
        Hashtable<String, String> hashtableobj = new Hashtable<String, String>();
        hashtableobj.put("Alive is ", "awesome");
        hashtableobj.put("Love", "yourself");
        System.out.println("Hashtable object output :" + hashtableobj);

        Map<String, String> mapP = new LinkedHashMap<>();
        mapP.put("Alive is ", "awesome");
        mapP.put("Love", "yourself");
        System.out.println("mapP object output :" + hashtableobj);


        HashMap hashmapobj = new HashMap();
        hashmapobj.put("Alive is ", "awesome");
        hashmapobj.put("Love", "yourself");
        System.out.println("HashMap object output :" + hashmapobj);
    }
}
