import java.util.ArrayList;

public class ALMaximumTrapWater {
    // brute force approach with TC of 0(n^2)
//    public static int maximumTrapWater(ArrayList<Integer> bar) {
//        int finalAnswer = 0;
//        //loop
//        for (int i = 0; i < bar.size(); i++) {
//            for (int j = i + 1; j < bar.size(); j++) {
//                //height
//                int height = Math.min(bar.get(i), bar.get(j));
//                //width
//                int width = j - i;
//                //current answer
//                int ans = height*width;
//                finalAnswer = Math.max(finalAnswer, ans);
//            }
//        }
//        return finalAnswer;
//    }

    public static int maximumTrapWater(ArrayList<Integer> bar) { // optimized version(2 pointer) with TC of o(n)
        //final answer
        int ans = 0;
        //loop
        int left = 0;
        int right = bar.size() - 1;
        while (left < right) {
            int height = Math.min(bar.get(left), bar.get(right));
            //width
            int width = right - left;
            //current answer
            int Currans = height * width;
            ans = Math.max(ans, Currans);
            // moving of both pointer
            if (bar.get(left) < bar.get(right)) {
                left++;
            } else {
                right--;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> bar = new ArrayList<>();
        bar.add(1);
        bar.add(8);
        bar.add(6);
        bar.add(2);
        bar.add(5);
        bar.add(4);
        bar.add(8);
        bar.add(3);
        bar.add(7);
        //System.out.print(maximumTrapWater(bar));
        System.out.print(maximumTrapWater(bar));
    }
}
