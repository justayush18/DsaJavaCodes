import java.util.HashMap;
import java.util.Iterator;

public class HMIteration {
    public static void main(String[] args) {
        HashMap<String, Integer> map  = new HashMap<>();
        map.put("india", 211);
        map.put("italy", 686);
        map.put("pakistan", 836);
        map.put("us", 274);
        map.put("china", 95);

        // approach - 1
        for (String i : map.keySet()){
            // with get values printed
            System.out.print(i + "->" + map.get(i)+ ", ");
            // w/o .get, we will get keys printed
        }

        // approach - 2
        Iterator i = map.values().iterator(); // or map.keySet().iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
