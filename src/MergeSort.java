public class MergeSort extends Sorting {
    void mergeSort(int[] arr, int si, int ei) {
        //base
        if (si >= ei) {
            return;
        }
        //core
        int mid = si + (ei - si) / 2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid + 1, ei);
        merge(arr, si, ei, mid);
    }

    void merge(int[] arr, int si, int ei, int mid) {
        int[] temp = new int[ei - si + 1];
        int k = 0;
        int i = si;
        int j = mid + 1;
        while (i <= mid && j <= ei) {
            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
        }
        //left
        while (i <= mid) {
            temp[k++] = arr[i++];
        }
        //right
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = {2, 5, 7, 3, 1, 6, 90, 32};
        ms.mergeSort(arr, 0, arr.length - 1);
        ms.printArray(arr);
    }
}
