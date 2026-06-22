public class LastOccurrence {
    public int lastOccur(int[] arr, int key, int i) {
        //base
        if (i == arr.length) {
            return -1;
        }
        int isFound = lastOccur(arr, key, i + 1);

        if (isFound == -1 && arr[i] == key) {
            return i;
        }
        return isFound;
    }

    public static void main(String[] args) {
        LastOccurrence lo = new LastOccurrence();
        int[] arr = {1, 2, 3, 1, 5};
        int key = 1;
        System.out.println(lo.lastOccur(arr, key, 0));
    }
}
