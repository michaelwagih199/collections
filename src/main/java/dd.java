import java.util.*;
import java.util.stream.Collectors;

public class dd {

    public static String SearchingChallenge(String[] strArr) {
        Map<String ,Integer> map = new HashMap();
        for (String str : strArr) {
            char key = str.charAt(0);
            String value = str.substring(2);
            map.put(String.valueOf(key), Integer.valueOf(value));
        }

        removeDublicate(map);
        // code goes here
        return strArr[0];
    }


    public static void main(String[] args) {
        // keep this function call here
        Scanner s = new Scanner(System.in);
        String[] ss = {"Z:0", "A:-1"};
        SearchingChallenge(ss);
//   System.out.print(SearchingChallenge(s.nextLine()));
    }

    public static void removeDublicate(Map<String,Integer> map){
        Set<String> existing = new HashSet<>();
        map = map.entrySet()
                .stream()
                .filter(entry -> existing.add(String.valueOf(entry.getValue())))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        map.forEach((k,v)->{
            StringBuilder s = new StringBuilder(k).append(":").append(v);
            System.out.println(s);
        });
    }

}
