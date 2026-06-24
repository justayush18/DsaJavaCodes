import java.util.ArrayList;

public class HeapManually {
    public static class Heap {
        ArrayList<Integer> list = new ArrayList<>();

        public void add(int data) {
            // add at last index
            list.add(data);

            // child val
            int c = list.getLast();
            // parent value
            int par = (c - 1) / 2;

            // swap until find place
            while (list.get(c) < list.get(par)) {
                int temp = list.get(c);
                list.set(c, list.get(par));
                list.set(par, temp);
            }
        }

        public int peek() {
            return list.getFirst();
        }

        public void heapify(int i) {
            int left = 2 * i + 1;
            int right = 2 * i + 2;
            int min = i;

            // check left child is eligible or not
            if (left < list.size() && list.get(left) < list.get(min)) {
                min = left;
            }
            if (right < list.size() && list.get(right) < list.get(min)) {
                min = right;
            }

            if (min != i) {
                //swap
                int temp = list.get(min);
                list.set(min, list.get(i));
                list.set(i, temp);

                heapify(min);
            }
        }

        public int remove() {
            if (list.isEmpty()) {
                throw new RuntimeException("list is empty");
            }
            // store val because show
            int data = list.getFirst();
            //swap
            int temp = list.getFirst();
            list.set(0, list.getLast());
            list.set(list.size() - 1, temp);
            // remove
            list.removeLast();
            heapify(0);
            return data;
        }
    }
}