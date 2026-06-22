public class SubString {
    static void subStr(String str, int si, int ei) {
        String substr = "";
        for (int i = si; i < ei; i++) {
            char ch = str.charAt(i);
            substr += ch;
        }
        System.out.println(substr);
    }

    public static void main(String[] args) {
        String str = "Alex";
        subStr(str, 0, 2);
    }
}
