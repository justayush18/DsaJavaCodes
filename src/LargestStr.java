public class LargestStr {
    static void largestString(String[] str) {
        if (str == null || str.length == 0) {
            System.out.println("Invalid input");
            return;
        }
        String largest = str[0];
        for (int i = 1; i < str.length; i++) {
            if (largest.compareToIgnoreCase(str[i]) < 0) {
                largest = str[i];
            }
        }
        System.out.print(largest);
    }

    public static void main(String[] args) {
        String[] str = {"Ayush", "Banana", "Cat"};
        largestString(str);
    }
}
