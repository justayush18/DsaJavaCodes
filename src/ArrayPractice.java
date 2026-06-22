import java.util.Scanner;

public class ArrayPractice {

    public static int binarySearch(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == key) {
                return mid;

            } else if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int linearSearch(int[] arr, int key) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void largestArrayNum(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                total++;
            }
        }
        System.out.println(largest + " : is largest Number at index " + total);
    }

    public static void reverseArray(int[] arr) {
        int first = 0, last = arr.length - 1;

        while (first < last) {
            int t = arr[last];
            arr[last] = arr[first];
            arr[first] = t;

            first++;
            last--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void pairInArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                System.out.print("(" + arr[i] + "," + arr[j] + ")");
            }
            System.out.println();
        }
    }

    public static void subArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k]);
                }

                System.out.println();
            }
            System.out.println();
        }
    }

    public static void maxOfSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + ">>");
                }
                System.out.print("Ans : " + sum);
                System.out.println();

                if (max < sum) {
                    max = sum;
                }
            }
            System.out.println();
            System.out.println("\n\nMax of sub array : " + max);
        }
    }

    public static void minOfSubArray(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j < arr.length; j++) {
                int sum = 0;
                for (int k = i; k <= j; k++) {
                    sum = sum + arr[k];
                    System.out.print(arr[k] + ">>");
                }
                System.out.print("Ans : " + sum);
                System.out.println();

                if (min > sum) {
                    min = sum;
                }
            }
            System.out.println();
            System.out.println("\n\nMin of sub array : " + min);
        }
    }

    public static void maxOfSubArrayUsingPreFix(int[] arr) {
        int max = Integer.MIN_VALUE;
        int[] prefix = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < prefix.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            int start = i;
            for (int j = i; j < arr.length; j++) {
                int end = j;
                int sum = 0;
                if (start == 0) {
                    sum = prefix[end];
                } else {
                    sum = prefix[end] - prefix[start - 1];
                }

                if (max < sum) {
                    max = sum;
                }
            }
        }
        System.out.println("Max of sub array : " + max);
    }

    public static void maxOfSubArrayUsingKadane(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (max < sum) {
                max = sum;
            } else if (sum < 0) {
                sum = 0;
            } else if (max == 0) {
                largestArrayNum(arr);
            }
        }
        System.out.println(sum + " : is max");
    }

    public static void trapWater(int[] arr) {
        int trapWater = 0;
        int l = arr.length;
        int width = 1;
        //right max boundary
        int[] leftMax = new int[l];
        leftMax[0] = arr[0];
        for (int i = 1; i < leftMax.length; i++) {
            leftMax[i] = Math.max(arr[i], leftMax[i - 1]);
        }

        // left max boundary
        int[] rightMax = new int[l];
        rightMax[l - 1] = arr[l - 1];
        for (int i = l - 2; i >= 0; i--) {
            rightMax[i] = Math.max(arr[i], rightMax[i + 1]);
        }

        for (int i = 0; i < l; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trapWater += (waterLevel - arr[i]) * width;
        }

        System.out.println("Total Trap Water is " + trapWater);
    }

    public static void stock(int[] price) {
        int buyPrice = Integer.MAX_VALUE;
        int wholePro = 0;
        int currPro = 0;

        for (int i = 0; i < price.length; i++) {
            if (buyPrice < price[i]) {
                currPro = price[i] - buyPrice;
                wholePro = Math.max(currPro, wholePro);
            } else {
                buyPrice = price[i];
            }
        }
        System.out.println("Approx ProFit you will get is : " + wholePro);
    }

    // Array Assignment QNA

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={4,5,6,7,0,1,2};
        int[] barLevel = {1,8,6,2,5,4,8,3,7};
        int[] stock = {7, 6, 4, 3, 1};
        //System.out.print("Enter target : ");
        //int key = sc.nextInt();

        //1. Binary Search
        //int ans = binarySearch(arr, key);
        //System.out.println(key + " found at index : "+ "[" + ans + "]");

        // 2. linear search
//        int ans = linearSearch(arr,key);
//        if (ans == -1){
//            System.out.println("Not Found");
//        }
//        else {
//            System.out.println(key + " found at index : "+ "[" + ans + "]");
//        }

        //3. largest element in array;
        //largestArrayNum(arr);

        //4. reverse array
        reverseArray(arr);

        // 5. PairsInArray
        //pairInArray(arr);

        //6. sub array
        //subArray(arr);

        //7. max out of each sub array
        //maxOfSubArray(arr);

        //8. min out of each sub array
        //minOfSubArray(arr);

        //9.PreFix Array using for sub array maximum
        //maxViaPreFixOfSubArray(arr);

        //10. Max of Subarray Sum using Kadane's Algorithm
        //maxOfSubArrayUsingKadane(arr);
        // in this algo when all element are minus we have to show the largest element of that negative array
        //its also depends on question if question mentioned that so we have to show other depends on que

        //11. Trap Rain Water
        trapWater(barLevel);

        //12. Stock
        //stock(stock);

        // Array Assignment QNA

        //1. Check Num is Twice present in array or not
        sc.close();
    }
}
