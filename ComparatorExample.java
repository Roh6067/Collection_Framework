import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//  class stringEx implements Comparator<String>{
//     @Override
//     public int compare(String o1, String o2) {
//         return o2.length() - o1.length();
//     }
// }

// class IntegerEx implements Comparator<Integer>{
//     @Override
//     public int compare(Integer o1, Integer o2) {
//         return  o2 - o1;
//     }
// }

// 3 8

class ComparatorExample{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);

        // using Comparator Interface
        // list.sort(new IntegerEx);

        // using lambda Expression
        list.sort((a,b) -> a - b);
        System.out.println(list);

        // list.sort(null);



        List<String> Meaning = Arrays.asList("James Gosling", "Brendan Eich", "Guido Van Rossum");
        // using Comparator Interface 
        // Meaning.sort(new StringEx);

        // using lambda Expression
        Meaning.sort((a,b) -> a.length() - b.length());
        System.out.println(Meaning);
    }
}