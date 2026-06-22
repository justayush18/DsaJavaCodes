import java.util.Scanner;

public class StringPrac {
    static boolean palindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Shortest Path
    static double shortestPath(String str) {
        int x = 0, y = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            //south
            if (ch == 'S') {
                y--;
            }
            // north
            else if (ch == 'N') {
                y++;
                //west
            } else if (ch == 'W') {
                x--;
                //east
            } else {
                x++;
            }
        }
        int x2 = x * x;
        int y2 = y * y;

        return Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // String Concatenation
//        String str = "Aysha";
//        String str2 = "Solana";
//        String strFinal = str + " " + str2;
//        System.out.println(strFinal);

        //String charAt Method
//        String str = "Aysha";
//        System.out.println(str.charAt(0));

        //Check If String Is Palindrome
//        String str = "noon";
//        if (palindrome(str)){
//            System.out.println("valid");
//        }
//        else {
//            System.out.println("not valid");
//        }

        //Shortest Path
//        String str = "WNEENESENNN";
//        double ans = shortestPath(str);
//        System.out.println(ans);
    }
}