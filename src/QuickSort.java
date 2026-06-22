public class QuickSort {
    // Hoare Partition Scheme (NOT Lomuto)
    // because in this we will assume pivot as middle value not the first vale

    static void coreOfQuick(int[] arr, int low, int high) {
        while (low < high) {
            int mid = low + (high - low) / 2;
            int pivot = arr[mid];
            int i = low, j = high;

            while (i <= j) {
                while (pivot > arr[i]) {
                    i++;
                }
                while (pivot < arr[j]) {
                    j--;
                }
                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }
            if (j - low < high - i) {
                if (low < j) {
                    coreOfQuick(arr, low, j);
                }
                low = i;
            } else {
                if (i < high) {
                    coreOfQuick(arr, i, high);
                }
                high = j;
            }
        }
    }

    static void mainQuickSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        coreOfQuick(arr, 0, arr.length - 1);
    }

    public static void main(String[] args) {
        int[] arr = {5, 9, 4, 6, 3, 10, -1};
        mainQuickSort(arr);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
