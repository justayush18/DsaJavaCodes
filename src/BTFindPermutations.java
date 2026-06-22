public class BTFindPermutations {

    public static void permutations(String str, String ans){
        //base case
        if (str.isEmpty()){
            System.out.println(ans);
            return;
        }
        // recursion
        for (int i = 0; i < str.length(); i++){
            char curr = str.charAt(i);
            String newStr = str.substring(0, i) + str.substring(i+1);
            permutations(newStr, ans+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        permutations(str, "");

    }
}
