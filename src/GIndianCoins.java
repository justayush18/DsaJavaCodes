import java.util.Arrays;

public class GIndianCoins {
    static int coinsSpend(int[] arr, int demand) {
        int ans = 0;
        Arrays.sort(arr);
        for (int i = arr.length-1; i >= 0; i--){
            if (arr[i] <= demand){
                while (arr[i] <= demand){
                    demand -= arr[i];
                    ans++;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 10, 20, 50, 100, 500, 1000, 2000};
        System.out.println(coinsSpend(arr, 590));
    }
}
