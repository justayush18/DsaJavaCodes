import java.util.ArrayList;

public class MostFrequentNumberFollowingKey {
    public static int mostFrequent(ArrayList<Integer> nums, int key) {
        int[] result = new int[1001];
        for (int i = 0; i < nums.size() - 1; i++) {
            if (nums.get(i) == key) {
                result[nums.get(i + 1) - 1]++;
            }
        }

        int max = Integer.MIN_VALUE;
        int ans = 0;
        for (int i = 0; i < result.length; i++) {
            if (result[i] > max) {
                max = result[i];
                ans = i + 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        //nums = [1, 100, 200, 1, 100],  key = 1
        int key = 1;
        ArrayList<Integer> num = new ArrayList<>();
        num.add(1);
        num.add(100);
        num.add(1);
        num.add(100);
        num.add(1);
        num.add(300);
        num.add(1);
        num.add(300);
        num.add(1);
        num.add(300);
        num.add(1);
        num.add(300);
        num.add(1);
        num.add(300);
        System.out.println(mostFrequent(num, key));
    }
}