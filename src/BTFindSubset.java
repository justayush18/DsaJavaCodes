public class BTFindSubset {

    public static void subset(String str, String ans, int i){
        //base case
        if (str.length() == i){
            if (ans.isEmpty()){
                System.out.println("NULL");
            }
            else {
                System.out.println(ans);
            }
            return;
        }
        //yes
        subset(str, ans+str.charAt(i), i+1);
        //no
        subset(str, ans, i+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subset(str, "", 0);
    }
}
