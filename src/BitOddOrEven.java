public class BitOddOrEven {
    static int oddOrEven(int num) {
        int mask = 1;
        if ((num & mask) == 0){
            return 0;
        }
        return 1;
    }

    public static void main(String[] args) {
        System.out.println(oddOrEven(4));
    }
}
