import java.util.PriorityQueue;
public class HeapJCF {
    static class Student implements Comparable<Student>{
        int rank;
        String name;

        Student(int rank, String name){
            this.rank = rank;
            this.name = name;
        }

        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue <Student> pq = new PriorityQueue<>();
//        pq.add(1);
//        pq.add(2);
//        pq.add(5);
//        pq.add(4);
//        pq.add(6);
//        while (!pq.isEmpty()){
//            System.out.println(pq.peek());
//            pq.remove();
//        }

        Student s1 = new Student(539, "Tingting Zhang");
        Student s2 = new Student(363, "Dmitriy Ruiz");
        Student s3 = new Student(133, "Florence Mohammad");
        Student s4 = new Student(748, "Khalid Ferreira");
        Student s5 = new Student(440, "An Khatoon");

        pq.add(s1);
        pq.add(s2);
        pq.add(s3);
        pq.add(s4);
        pq.add(s5);

        while (!pq.isEmpty()){
            System.out.println(pq.peek().rank + "->" + pq.peek().name);
            pq.remove();
        }
    }
}
