import java.util.*;

public class HMImplementation {
    static class HashMap<K, V> { // generic <k, v>
        private class Node {
            K key;
            V val;

            private Node(K key, V val) {
                this.key = key;
                this.val = val;
            }
        }

        private int n; // size
        private int N;
        private LinkedList<Node>[] buket; //N

        // constructor of HashMap class
        public HashMap() {
            this.n = 0;
            this.buket = new LinkedList[4];
            this.N = buket.length;
            for (int i = 0; i < N; i++) {
                this.buket[i] = new LinkedList<>();
            }
        }

        private int bucketIdx(K key) {
            int hc = key.hashCode();
            // use abs to convert any negative into positive for proper indexing
            hc = Math.abs(hc);
            return hc % N;
        }

        public int dataIdx(K key, int bi) {
            LinkedList<Node> ll = buket[bi];
            int di = 0;
            for (int i = 0; i < ll.size(); i++) {
                Node n = ll.get(i);
                if (Objects.equals(n.key, key)) {
                    return di;
                }
                di++;
            }
            return -1;
        }

        public void put(K key, V value) {
            int bi = bucketIdx(key);
            int di = dataIdx(key, bi);

            if (di != -1) {
                Node n = buket[bi].get(di);
                n.val = value;
            } else {
                buket[bi].add(new Node(key, value));
                n++;
            }

            // check for re-hashing
            // make lambda not int because decimal val may come and also type cast answer of n/N;
            double lambda = (double) n / N;
            if (lambda > 2.0) {
                rehash();
            }
        }

        public void rehash() {
            LinkedList<Node>[] old = buket;
            N = 2 * N;
            buket = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buket[i] = new LinkedList<>();
            }
            n = 0; //  Reset the total size

            for (int i = 0; i < old.length; i++) {
                LinkedList<Node> ll = old[i];
                while (!ll.isEmpty()) {
                    Node node = ll.remove();
                    put(node.key, node.val);
                }
            }
        }

        public boolean containsKey(K key) {
            int bi = bucketIdx(key);
            int di = dataIdx(key, bi);

            return di != -1;
        }

        public V get(K key) {
            int bi = bucketIdx(key);
            int di = dataIdx(key, bi);

            if (di != -1) {
                Node node = buket[bi].get(di);
                return node.val;
            }
            return null;
        }

        public V remove(K key) {
            int bi = bucketIdx(key);
            int di = dataIdx(key, bi);

            if (di != -1) {
                Node node = buket[bi].remove(di);
                n--;
                return node.val;
            }
            return null;
        }

        public ArrayList<K> keySet() {
            ArrayList<K> list = new ArrayList<>();
            for (int i = 0; i < N; i++) {
                LinkedList<Node> ll = buket[i];
                for (int j = 0; j < ll.size(); j++) {
                    Node node = ll.get(j);
                    list.add(node.key);
                }
            }
            return list;
        }

        public boolean isEmpty() {
            return n == 0;
        }
    }

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("India", 883);
        map.put("China", 306);
        map.put("Italy", 787);
        map.put("Pakistan", 282);
        map.put("Europe", 57);

        // tried out all function with sout

        ArrayList<String> key = map.keySet();
        for (String i : key) {
            System.out.println(i);
        }
    }
}
