import java.util.EnumMap;
import java.util.Map;

class EnumMapDemo{
    public static void main(String[] args) {
        Map<Day, String> map = new EnumMap<>(Day.class);
        map.put(Day.TUESDAY, "Gym");
        map.put(Day.MONDAY, "Walk");
        String s = map.get(Day.TUESDAY);
        System.out.println(map);
    }
}
 
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
}
