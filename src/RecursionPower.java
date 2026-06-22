public class RecursionPower {
    static int powerBruteForce(int n, int p) {
        if (p == 0 || p == 1) {
            return 1;
        }
        return n * powerBruteForce(n, p - 1);
    }

    static int Optimized(int n, int p) {
        if (p == 0) {
            return 1;
        }
        if (p == 1) {
            return n;
        }

        int half = Optimized(n, p / 2);
        int halfDouble = half * half;

        if (p % 2 == 0) {
            return halfDouble;
        } else {
            return n * halfDouble;
        }
    }


    public static void main(String[] args) {
        System.out.print(powerBruteForce(2,2));
        System.out.print(Optimized(2, 1));
    }
}
