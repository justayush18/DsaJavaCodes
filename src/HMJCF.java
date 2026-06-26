import java.util.HashMap;

public class HMJCF {
    public static void main(String[] args) {
        HashMap <String, Integer> map  = new HashMap<>();
        map.put("india", 211);
        map.put("italy", 686);
        map.put("pakistan", 836);
        map.put("us", 274);
        map.put("china", 95);
        System.out.println(map);
        map.remove("china");
        System.out.println(map);
        System.out.println(map.get("con"));
        System.out.println(map.containsKey("italy"));
    }
}
