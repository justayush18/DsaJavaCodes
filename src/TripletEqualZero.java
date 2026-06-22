public class TripletEqualZero {
    public static void main(String[] args) {
        int[] num = {-1, 0, 1, 2, -1,-4};

        for (int i = 0; i < num.length; i++){
            for (int j = i+1; j < num.length; j++) {
                for (int k = j+1; k < num.length; k++) {
                    if (num[i] + num[j] + num[k] == 0){
                        if (num[i] == num[j] || num[i] == num[k] || num[j] == num[k]){
                            continue;
                        }
                        System.out.println(num[i] + " " + num[j] + " " + num[k]);
                    }
                }
            }
        }
    }
}
