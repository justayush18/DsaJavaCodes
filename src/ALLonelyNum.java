import java.util.ArrayList;
import java.util.Collections;

public class ALLonelyNum {
    // [10,6,5,8]
    public static ArrayList<Integer> lonely(ArrayList<Integer> list) {
        Collections.sort(list);
        ArrayList<Integer> ans = new ArrayList<>();

        //middle value only
        for (int i = 1; i < list.size() - 1; i++) {
            if (list.get(i - 1) + 1 < list.get(i) && list.get(i) + 1 < list.get(i + 1)) {
                ans.add(list.get(i));
            }
        }

        // check for first element only
        if (list.getFirst() + 1 < list.get(1)) {
            ans.add(list.getFirst());
        }

        //check for last element only
        if (list.get(list.size()- 2) +1 < list.get(list.size()-1 )){
            ans.add(list.get(list.size()-1));
        }
        // for once
        if (list.size() == 1){
            ans.add(list.getFirst());
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(6);
        list.add(5);
        list.add(8);
        ArrayList <Integer> result = lonely(list);
        System.out.println(result);
    }
}
