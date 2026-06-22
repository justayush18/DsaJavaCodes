import java.util.ArrayList;

public class TwoDAL {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mList = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(6);
        list3.add(9);
        list3.add(12);
        list3.add(15);
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(4);
        list2.add(6);
        list2.add(8);
        list2.add(10);
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        mList.add(list1);
        mList.add(list2);
        mList.add(list3);

        System.out.print(mList);
    }
}
