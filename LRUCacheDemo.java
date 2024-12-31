import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCacheDemo<K, V> extends LinkedHashMap<K, V>{
    private int capacity;
    
    public LRUCacheDemo(int capacity){
        super(capacity, 0.7f, true);
        this.capacity = capacity;
    }

    protected boolean removeEldestEntry(Map.Entry<K, V> eldest){
        return size() > capacity;
    }


    public static void main(String[] args) {
        LRUCacheDemo<String, Integer> personMap = new LRUCacheDemo(3);
        personMap.put("Anal", 77);
        personMap.put("Jofery", 83);
        personMap.put("Pransu", 98);
        personMap.put("Anal", 89);

        personMap.put("Yansu", 99);
        System.out.println(personMap);

    }
}

