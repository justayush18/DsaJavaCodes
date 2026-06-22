public class RecursionTailingProb {
    static int tailingProblem(int n) {
        //base
        if (n == 0 || n == 1){
            return 1;
        }
        //kam
        int vertical = tailingProblem(n - 1);
        int horizontal = tailingProblem(n - 2);

        return vertical+horizontal;
    }

    public static void main(String[] args) {
        System.out.print(tailingProblem(3));
    }
}
