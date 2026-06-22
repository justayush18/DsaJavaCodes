import java.util.Stack;

public class StackHistogramRectangle {
    
    static int maxArea(int[] height) {
        int[] nser = new int[height.length];
        int[] nsel = new int[height.length];
        Stack<Integer> s = new Stack<>();

        for (int i = height.length - 1; i > 0; i--) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nser[i] = height.length;
            } else {
                nser[i] = s.peek();
            }
            s.push(i);
        }

        s = new Stack<>();

        for (int i = 0; i < height.length; i++) {
            while (!s.isEmpty() && height[s.peek()] >= height[i]) {
                s.pop();
            }
            if (s.isEmpty()) {
                nsel[i] = height.length;
            } else {
                nsel[i] = s.peek();
            }
            s.push(i);
        }
        // max area calculating
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            int width = nser[i] - nsel[i] - 1;
            int area = height[i] * width;
            maxArea = Math.max(area, maxArea);
        }
        return maxArea;
    }

    public static void main(String[] args) {
        int[] arr = {2, 1, 5, 6, 2, 3};
        System.out.println(maxArea(arr));
    }
}
