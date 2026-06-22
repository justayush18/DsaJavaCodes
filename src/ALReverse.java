import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ALReverse {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        list.add(5);
        // reverse
//        for (int i = list.size()-1; i >= 0; i--){
//            System.out.print(list.get(i)+ " ");
//        }

        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);
        list.add(6);

        // find max
//        int max = Integer.MIN_VALUE;
//        for (int i=0; i < list.size();i++){
//            //method 1
//            if (list.get(i) > max){
//                max = list.get(i);
//            }
//            // method 2
//            max = Math.max(max, list.get(i));
//        }
//        System.out.print(max);

        //3. swap numbers
//        int indx1 = 1; int indx2 = 3;
//        int temp = list.get(indx1);
//        list.set(indx1, list.get(indx2));
//        list.set(indx2, temp);
        Collections.sort(list);
        System.out.println(list);


    }
}
