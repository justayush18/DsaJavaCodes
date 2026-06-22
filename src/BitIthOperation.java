public class BitIthOperation {
    //Get = check, Set = put 1, Clear = put 0, Update = decide value

    static int get(int n, int i) {
        int mask = 1 << i;
        if ((n & mask) == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    static int set(int num, int i) {
        int mask = 1 << i;
        return num | mask;
    }

    static int clear(int n, int i) {
        int mask = ~(1 << i);
        return n & mask;
    }

    static int update(int n, int i, int nb) {
        if (nb == 0) {
            return clear(n, i);
        }
        return set(n, i);
    }

    static int clearIBits(int n, int i) {
        int mask = (~0) << i;
        return mask & n;
    }

    static int clearBitsInRange(int n, int i, int j) {
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int mask = a | b;
        return mask & n;
    }

    static int powerOfTwoOrNot(int n) {
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.print("you have got 0 bcos " + n + " is power of 2: ");
            return 0;
        } else {
            System.out.print("you have got 1 bcos " + n + " is not power of 2: ");
            return 1;
        }
    }

    static int countSetBit(int n) {
        int count = 0;
        while (n > 0) {
            if ((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }

    static int fastExpo(int a, int n) {
        int ans = 1;
        while (n > 0) {
            if ((n & 1) != 0) {
                ans = ans * a;
            }
            a = a * a;
            n = n >> 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        //System.out.print(get(4, 3));
        //System.out.print(set(10,2));
        //System.out.println(clear(10,2));
        //System.out.println(update(10,2,1));
        //System.out.println(clearIBits(10,2));
        //System.out.println(clearBitsInRange(10,2,7));
        //System.out.println(powerOfTwoOrNot(8));
        //System.out.println(countSetBit(16));
        System.out.println(fastExpo(3,5));
    }
}
