import java.util.Arrays;
import java.util.Comparator;

public class GChocolateProblem {

    public static void main(String[] args) {
        Integer[] costHor = {2, 1, 4};
        Integer[] costVer = {2, 1, 3, 1, 4};

        Arrays.sort(costHor, Comparator.reverseOrder());
        Arrays.sort(costVer, Comparator.reverseOrder());

        int h = 0, v = 0, vp = 1, hp = 1, cost = 0;

        while(h < costHor.length && v < costVer.length){
            if (costVer[v] <= costHor[h]){
                //horizontal cut
                cost = cost +(costHor[h] * vp);
                hp++;
                h++;
            } else {
                cost = cost + (costVer[v] * hp);
                vp++;
                v++;
            }
        }
        while (h < costHor.length){
            cost = cost +(costHor[h] * vp);
            hp++;
            h++;
        }
        while (v < costVer.length){
            cost = cost + (costVer[v] * hp);
            vp++;
            v++;
        }

        System.out.println("final cost : " + cost);
    }
}
