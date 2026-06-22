import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class GKthLargestOdd {

//    static int kThLargest(Integer[] arr, int k) {
//        ArrayList<Integer> al = new ArrayList<>();
//
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] % 2 != 0) {
//                al.add(arr[i]);
//            }
//        }
//
//        //reverse whole list
//        Collections.sort(al);
//        Collections.reverse(al);
//        // if k asking for out of bound
//        if (k > al.size() || k <= 0) return 0;
//            // determine largest
//        else
//            return al.get(k - 1);
//    }

    //optimized approach w/o extra memory
    static int kThLargest(int[] arr, int k ) {
        if (k <= 0) return 0;

        int count = 0;
        // Walk backwards from the end of the array (largest to smallest)
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] % 2 != 0) {
                count++;
                if (count == k) {
                    return arr[i];
                }
            }
        }
        return 0; // If we finish the loop and haven't found k odd numbers
    }


    public static void main(String[] args) {
        int[] arr = {10, 11, 20, 21, 30, 31, 40, 41, 50, 51};
        System.out.println(kThLargest(arr, 1));
    }
}
