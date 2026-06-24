import java.util.PriorityQueue;

public class HeapConnectRopes {
    public static void main(String[] args) {
        int[] rope = {2, 3, 3, 4, 6};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : rope) {
            pq.add(i);
        }

        int cost = 0;

        while (pq.size() > 1) {
            int min1 = pq.remove();
            int min2 = pq.remove();
            pq.add(min1 + min2);
            cost = cost + min1 + min2;
        }

        System.out.println(cost);
    }
}
