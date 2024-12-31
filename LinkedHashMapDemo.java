import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> items = new LinkedHashMap<>(11, 0.5f, true);
        items.put("Bully", 12);
        items.put("Bob", 15);
        items.put("Puppy", 20);
        items.put("Tommy", 5);


        items.get("Puppy");
        items.get("Tommy");
        items.get("Puppy");
        items.get("Tommy");
        items.get("Puppy");
        items.get("Tommy");
        items.get("Bully");
        items.get("Bob");

       for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }


        HashMap<String, Integer> hashMap = new HashMap<>();
        LinkedHashMap linkedHashMap = new LinkedHashMap<>(hashMap);

        hashMap.put("Akshita", 88);
        hashMap.put("Anay", 99);
        hashMap.put("Gihoo", 91);
        hashMap.put("Peehu", 85);

        //Methods -->
       Integer res = hashMap.getOrDefault("items", 9);
       System.out.println(res);

       hashMap.putIfAbsent("Anay", 85);
       hashMap.put("Anay", 85);
       System.out.println(hashMap);
    }
}
