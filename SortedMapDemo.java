
import java.util.NavigableMap;
import java.util.SortedMap;
import java.util.TreeMap;

class SortedMapDemo{
    public static void main(String[] args) {
        // SortedMap 
        SortedMap<Integer, String> sortedMap = new TreeMap<>((a,b) -> b -a); // ((a,b) -> b -a) --> for print Descending Order
        sortedMap.put(89,"Devil");
        sortedMap.put(98,"Macle");
        sortedMap.put(92,"Dude");
        sortedMap.put(83,"Charlie");
        sortedMap.put(78,"Amina");
        // System.out.println(sortedMap);

        // System.out.println(sortedMap.firstKey()); // 78
        // System.out.println(sortedMap.lastKey()); // 98
        // System.out.println(sortedMap.headMap(92)); // to
        // System.out.println(sortedMap.tailMap(92)); // from where
        // System.out.println(sortedMap.subMap(78, 92)); // fromKey Se toKey


        // NavigableMap 
        NavigableMap<Integer, String> navigableMap = new TreeMap<>();
        navigableMap.put(1, "One");
        navigableMap.put(8, "Eight");
        navigableMap.put(2, "Two");
        System.out.println(navigableMap);
        // Methods 
        System.out.println(navigableMap.lowerKey(5));
        System.out.println(navigableMap.ceilingEntry(2));
        System.out.println(navigableMap.higherKey(2));
        System.out.println(navigableMap.higherEntry(1));
        System.out.println(navigableMap.descendingMap());
    }
}