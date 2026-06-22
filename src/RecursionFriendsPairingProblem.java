public class RecursionFriendsPairingProblem {
    int friendsPairing(int n) {
        //base
        if (n == 1 || n == 2) {
            return n;
        }
        //kaam
        int fn1 = friendsPairing(n - 1);
        int fnm2 = friendsPairing(n - 2);
        int pairWays = (n - 1) * fnm2;

        return fn1 + pairWays;
    }

    public static void main(String[] args) {
        RecursionFriendsPairingProblem fp = new RecursionFriendsPairingProblem();
        System.out.println(fp.friendsPairing(5));
    }
}
