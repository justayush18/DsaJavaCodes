import java.util.PriorityQueue;

public class HeapWeakSolider {

    public static class Solider implements Comparable<Solider> {
        int count;
        int idx;

        public Solider(int count, int idx) {
            this.count = count;
            this.idx = idx;
        }

        public int compareTo(Solider s) {
            if (this.count == s.count) {
                return this.idx - s.idx;
            }
            return this.count - s.count;
        }

    }

    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0},
                {1, 1, 1, 1},
                {1, 0, 0, 0},
                {1, 0, 0, 0}};
        int k = 2;
        PriorityQueue<Solider> pq = new PriorityQueue<>();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr[0].length; j++) {
                count += arr[i][j] == 1 ? 1 : 0;
            }
            pq.add(new Solider(count, i));
        }
        for (int i = 0; i < k; i++){
            System.out.println("Row" + pq.remove().idx);
        }
    }
}
