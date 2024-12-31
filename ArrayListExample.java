import java.util.ArrayList;
import java.util.List;

class ArrayListExample{
    public static void main(String[] args) throws Exception {
        List<Integer> list = new ArrayList<>(100); // Capacity 100 and size by default 10 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 
        // list.add(1); 

        list.add(2);
        list.add(3);
        list.add(4);

        list.remove(Integer.valueOf(3));

        System.out.println(list);

        
        // List<Integer> list1 = List.of(4, 5, 7, 8, 4);
        // list.addAll(list1);
        // System.out.println(list);

    List<String> list1 = new ArrayList<>();
    list1.add("Indore");
    list1.add("Bhopal");
    list1.add("Gwalior");
    list1.add("Ujjain");

    list1.remove("Gwalior");

    System.out.println(list1);


        // list.add(90); // 0
        // list.add(50); // 1
        // list.add(5);  // 2

        // System.out.println(list);
    
        // for (int i = 0; i <= list.size(); i++) {
        //         System.out.println(list.get(i));
        // }

        // list.add(1, 80);
        // // Approach for accessing data
        // for(int x: list){
        //         System.out.println(x);
        // }

        // System.out.println(list.contains(90)); // true
        // System.out.println(list.contains(0));  // False


        // Swap two no
        // int a = 20;
        // int b = 5;

        // a = a + b; // 25
        // b = a - b; // 20 (25-5)
        // a = a - b; // 5 (25-20)

        // Using Betwise X-OR operation
        // a = a ^ b;
        // b = a ^ b;
        // a = a ^ b;
        
    }
}