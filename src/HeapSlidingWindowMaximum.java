import java.util.PriorityQueue;

public class HeapSlidingWindowMaximum {
    public static class Pairs implements Comparable<Pairs> {
        int data, idx;

        public Pairs(int data, int idx) {
            this.data = data;
            this.idx = idx;
        }

        public int compareTo(Pairs p) {
            return p.data - this.data;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int[] res = new int[arr.length - k + 1]; // n-k+1
        // n - k + 1 = number of possible windows of size k in an array of size n.
        PriorityQueue <Pairs> pq = new PriorityQueue<>();
         // 1st window
        for (int i = 0; i < k; i++){
            pq.add(new Pairs(arr[i], i));
        }
        res[0] = pq.peek().data;

        for (int i = k; i < arr.length; i++){
            while(!pq.isEmpty() && pq.peek().idx <= (i-k)){
                pq.remove();
            }
            pq.add(new Pairs(arr[i], i));
            res[i-k+1] = pq.peek().data;
            // res[0-0+1] means store element at this index in res like i++
        }

        for (int ele : res){
            System.out.print(ele + " ");
        }
    }
}
