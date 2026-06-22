public class DiagonalMatrixSum {
    static void diagonalSum(int[][] mat) {
        int sum = 0;
        // method of BruteForce because it has o(n^2) TC
//        for (int i = 0; i < mat.length; i++){
//            for (int j = 0; j < mat[0].length; j++){
//                if (i == j){
//                    sum = sum + mat[i][j];
//                } else if (i + j == mat.length-1) {
//                    sum = sum + mat[i][j];
//                }
//            }
//        }
//        System.out.println(sum);

        //method for optimized approach o(n)
        for (int i = 0; i < mat.length; i++) {
            //pd
            sum+= mat[i][i];
            //sd
            if(i != mat.length-i-1)
                sum+= mat[i][mat.length-i-1];
        }
        System.out.print(sum);
    }

    public static void main(String[] args) {
        //int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        diagonalSum(arr);
    }
}
