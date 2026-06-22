import java.util.Stack;

public class StackOperations {

    String reverseStr(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i < str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder sb = new StringBuilder("");
        while (!s.isEmpty()) {
            char curr = s.pop();
            sb.append(curr);
        }
        str = sb.toString();
        return str;
    }

    void pushAtBottom(Stack <Integer> s,int data){
        if (s.isEmpty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }

    void reverseAStack(Stack<Integer> s){
        if (s.isEmpty()){
            return;
        }
        int data = s.pop();
        reverseAStack(s);
        pushAtBottom(s, data);
    }
}
