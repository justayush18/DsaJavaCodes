public class RemoveDuplicatesInString {

    void removeDuplicates(int i, String str, boolean[] map, StringBuilder newStr) {
        //base
        if (i == str.length()) {
            System.out.println(newStr);
            return;
        }
        char curr = str.charAt(i);

        if (map[curr - 'a'] == true) {
            removeDuplicates(i + 1, str, map, newStr);
        } else {
            map[curr - 'a'] = true;
            removeDuplicates(i + 1, str, map, newStr.append(curr));
        }
    }

    public static void main(String[] args) {
        RemoveDuplicatesInString rd = new RemoveDuplicatesInString();
        String str = "benched";
        StringBuilder sb = new StringBuilder();
        boolean[] arr = new boolean[26];
        rd.removeDuplicates(0, str, arr, sb);

    }
}
