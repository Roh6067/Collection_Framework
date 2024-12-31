import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapDemo{
    public static void main(String[] args) {
        HashMap<Integer, String> name = new HashMap<>(18, 0.5f);
        name.put(11, "Bully");
        name.put(31, "Bob");
        name.put(13, "Puppy");
        name.put(null, "Tommy");

        System.out.println(name);

        String student = name.get(43);  
        System.out.println(student); // Null
        System.out.println(name.containsKey(31));
        System.out.println(name.containsValue("Bob"));

        try {   
        for (int i : name.keySet()) {
            System.out.println(name.get(i));
        }
        } catch (Exception e) {
            System.out.println(e);
        }       

        Set<Map.Entry<Integer, String>> entries = name.entrySet();

        // for(Map.Entry<Integer, String> entry : entries) {
        //     entry.setValue(entry.getValue().toUpperCase());

        // }
        // System.out.println(name);

        boolean res = name.remove(31, "Bob");
        System.out.println("IsRemoved: " + res);

        System.out.println(name);
        
    }
}