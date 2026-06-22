public class BTinArray {
    public static void arr(int[] arr, int i, int v) {
        //base case
        if (i == arr.length) {
            printArr(arr);
            return;
        }
        //recursion
        arr[i]= v;
        arr(arr, i+1, v+1);
        // backtracking
        arr[i] = arr[i] - 2;
    }

    public static void printArr(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele);
        }
        System.out.println();

    }

    public static void main(String[] args) {
        int[] arr = new int[5];
        arr(arr, 0, 1);
        printArr(arr);

    }
}
