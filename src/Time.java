public class Time {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left != right) {
            int currSum = nums[left] + nums[right];
            if (target == currSum) {
                return new int[]{left, right};
            } else if (currSum > target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{left, right};
    }

    public static void main(String[] args) {
        int[] num = {3,2,4};
        int[] ans = (twoSum(num, 6));
        for (int i : ans){
            System.out.println(i);
        }
    }
}