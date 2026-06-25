import java.util.HashSet;

public class HSUnion_Intersection {
    public static void main(String[] args) {
        int[] num1 = {7, 3, 9};
        int[] num2 = {6, 3, 9, 2, 9, 4};
        HashSet<Integer> set = new HashSet<>();

        for (int i : num1) {
            set.add(i);
        }
        for (int j : num2) {
            set.add(j);
        }
        System.out.println("Union : "+set.size());

        // intersection
        set.clear();
        for (int i : num1){
            set.add(i);
        }
        int count = 0;
        for (int j : num2) {
            if (set.contains(j)) {
                count++;
                set.remove(j);
            }
        }
        System.out.println("intersection : "+count);
    }
}
