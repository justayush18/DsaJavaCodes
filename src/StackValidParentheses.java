import java.util.Stack;

public class StackValidParentheses {

    static boolean validParentheses(String s) {
        if (s.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                if ((ch == ')' && stack.peek() == '(')
                        || (ch == ']' && stack.peek() == '[')
                        || (ch == '}' && stack.peek() == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "[]{}()";
        System.out.println(validParentheses(str));
    }
}
