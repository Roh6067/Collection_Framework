import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
    public static void main(String[] args) {
        String key1 = new String("Akshit");
        String key2 = new String("Akshit");
        System.out.println(System.identityHashCode(key1));
        System.out.println(System.identityHashCode(key2));
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1, 90);
        map.put(key2, 92);
        System.out.println(map);
    }
}