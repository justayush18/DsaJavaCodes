import java.util.ArrayList;

public class ALPairSum {

//    public static boolean pairSum(ArrayList<Integer> que, int target) {
//        if (que == null || que.size() < 2) {
//            return false;
//        }
//        int left = 0;
//        int right = que.size() - 1;
//        while (left < right) {
//            int ans = que.get(left) + que.get(right);
//            if (ans == target) {
//                return true;
//            } else if (ans < target) {
//                left++;
//            } else {
//                right--;
//            }
//        }
//        return false;
//    }
    public static boolean pairSum2(ArrayList<Integer> que, int target){
        int n = que.size();
        int bp = -1;

        for (int i = 0; i < n-1; i++){
            if (que.get(i) > que.get(i+1)){
                bp = i;
                break;
            }
        }
        int lp = bp+1;
        int rp = bp;
        while(lp != rp){
            int ans = que.get(lp) + que.get(rp);
            if (ans == target) {
                return true;
            } else if (ans < target) {
                lp = (lp+1)%n;
            } else {
                rp = (n+rp-1)%n;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        //[1, 2, 3, 4, 5, 6] target=5
        ArrayList<Integer> que = new ArrayList<>();
        que.add(11);
        que.add(15);
        que.add(6);
        que.add(7);
        que.add(8);
        que.add(9);
        que.add(10);
        System.out.println(pairSum2(que, 21));
    }
}
