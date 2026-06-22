public class Recursions {
    int sumOfNaturalNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        return n + factorial(n - 1);
    }

    int factorial(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    int fib(int n){
        if (n == 0){
            return 0;
        } else if (n == 1) {
            return 1;
        }
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Recursions rec = new Recursions();
        //System.out.println(rec.factorial(10));
        //System.out.println(rec.sumOfNaturalNumbers(10));
        //System.out.println(rec.fib(6));
    }
}