public class FirstOccurrence {
    int firstOccur(int i, int[] arr, int key) {
        if (arr.length - 1 == i) {
            return -1;
        }
        if (key == arr[i]) {
            return i;
        }

        return firstOccur(i + 1, arr, key);
    }

    public static void main(String[] args) {
        FirstOccurrence obj = new FirstOccurrence();
        int[] arr = {1,2,3,1,5};
        System.out.print(obj.firstOccur(0, arr, 3));
    }
}
