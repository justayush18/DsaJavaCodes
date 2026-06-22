import java.util.Arrays;

public class TwoSumForSortedArray {
    public static int[] twoSum(int[] num, int target) {
        int left = 0;
        int right = num.length - 1;

        while (left < right) {
            int currSum = num[left] + num[right];
            if (target == currSum) {
                return new int[]{left, right};
            } else if (currSum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,7,9,11};
        int target = 20;
        int[] ans = twoSum(arr, target);
        System.out.println(Arrays.toString(ans));
    }
}
