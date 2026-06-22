import java.util.Arrays;


public class Sorting {

    void printArray(int[] arr) {
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    void bubble(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    //swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minPos = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPos] > arr[j]) {
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);
    }

    void insertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];
            int prev = i - 1;
            // adjust element to make room OR making gap for element
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];
                prev--;
            }
            //insertion
            arr[prev + 1] = curr;
        }
        printArray(arr);
    }

    void counting(int[] arr) {
        int largestOf = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            largestOf = Math.max(arr[i], largestOf);
        }

        // counting frequency
        int count[] = new int[largestOf + 1];
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        //inserting
        int j = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
        printArray(arr);
    }

    void inbuilt(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Sorting srt = new Sorting();
        int[] arr = {5, 4, 1, 3, 2};
        int[] countArr = {1, 4, 1, 3, 2, 4, 3, 7};
        //1.
        //srt.inbuilt(arr);

        //2.
        //srt.bubble(arr);

        //3.
        //srt.insertion(arr);

        //4.
        //srt.selection(arr);

        //5.
        srt.counting(countArr);

    }
}


