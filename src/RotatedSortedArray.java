import java.util.Scanner;
// leet code 33
public class RotatedSortedArray {
    public int findMinimumIndex(int[] num) {
        int left = 0;
        int right = num.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;

            if (mid > 0 && num[mid - 1] > num[mid]) {
                return mid;
            }
            if (num[mid] > num[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }

    public int mainSearch(int[] num, int target) {
        if (num == null || num.length == 0) {
            return -1;
        }
        int minimumIndex = findMinimumIndex(num);

        if (target >= num[minimumIndex] && target <= num[num.length - 1]) {
            return binarySearch(num, minimumIndex, num.length - 1, target);
        } else {
            return binarySearch(num, 0, minimumIndex - 1, target);
        }
    }

    public int binarySearch(int[] num, int left, int right, int target) {

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (num[mid] == target)
                return mid;

            if (num[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        RotatedSortedArray rsa = new RotatedSortedArray();
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();

        System.out.println(rsa.mainSearch(arr, target));
    }
}
