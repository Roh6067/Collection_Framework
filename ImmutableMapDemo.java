import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class ImmutableMapDemo {

    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = Collections.unmodifiableMap(map1);
        System.out.println(map2);
        //map2.put("C", 3);  // throws Exception
        Map<String, Integer> map3 = Map.of("Anal", 8, "Niya", 5); // Limitation --> Only 10 Key Value stored
        System.out.println(map3);
        map3.put("Hiuna", 9);
        Map<String, Integer> map4 = Map.ofEntries(Map.entry("Jiya", 4), Map.entry("Monika", 5), Map.entry("Slema", 98)); // Does't have Limitations
    }
}
