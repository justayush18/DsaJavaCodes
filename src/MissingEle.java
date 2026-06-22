public class MissingEle {

    public static void missing(int[] arr){
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n;i++){
            sum = sum + arr[i];
        }
        int something = (n*(n+1))/2;
        int result = something - sum;
        System.out.println("missing ele or pivot ele is : " + result);
    }

    public static void main(String[] args) {
        int [] arr = {0,1,2,4,5,6};
        missing(arr);
    }
}
