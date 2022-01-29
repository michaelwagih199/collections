package lamda;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MapsTestVsFlatMap {
    public static void main(String[] args) {
        Stream.of("1", "2", "3", "4")
                .map(Integer::valueOf)
                .forEach(System.out::println);


        Stream.of(Arrays.asList("michael", "Wagih", "25"),
                        Arrays.asList("Mena", "Fady", "25"),
                        Arrays.asList("Maged", "latif", "52"),
                        Arrays.asList("Bassam","Gamal","20"))
                .flatMap(list -> list.stream())
                .map(s->s.toLowerCase())
                .filter(p -> p.startsWith("b"))
                .forEach(System.out::println);

      Map<String, Integer> myMap = new HashMap<>();
      Map<String, Integer> myMapT = new Hashtable<>();
      Map<String, Integer> myMapTre = new TreeMap<>();

      myMap.put("p1",50);
      myMap.put("p1",null);
      myMapT.put("p1",null);






    }
}
