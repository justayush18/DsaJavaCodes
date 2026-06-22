import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        boolean isPrime = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter : ");
        int n = sc.nextInt();
        if (n <= 1){
            System.out.println("not a prime");
        }
        else {
            for (int i = 2; i <= Math.sqrt(n); i++){
                if (n % i == 0){
                    isPrime = false;
                }
            }
            if (isPrime){
                System.out.println(n + " : is Yes");
            }
            else {
                System.out.println(n + " : is No");
            }
        }
    }
}