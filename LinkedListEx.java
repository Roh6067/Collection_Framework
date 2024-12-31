import java.util.Arrays;
import java.util.LinkedList;


class LinkedListEx{
    public static void main(String[] args) {
        LinkedList<Integer> link = new LinkedList<>();
        link.add(5);
        link.add(3);
        link.addFirst(0);
        link.addLast(100);
        link.get(2);
        link.getFirst();
        link.getLast();

        link.removeIf(x -> x % 2 == 0);
        System.out.println(link);

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("Yellow", "Red", "Green"));
        LinkedList<String> colorsToRemove = new LinkedList<>(Arrays.asList("Magenta", "Yellow", "Brown"));
        colors.removeAll(colorsToRemove);
        System.out.println(colors);
    }
}