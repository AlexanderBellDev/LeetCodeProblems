package dev.alexanderbell;

public class RangeSumQuery2DLeetCode {
    public static void main(String[] args) {
//        int[][] ints = new int[5][5];
//        ints[0] = new int[]{3, 0, 1, 4, 2};
//        ints[1] = new int[]{5, 6, 3, 2, 1};
//        ints[2] = new int[]{1, 2, 0, 1, 5};
//        ints[3] = new int[]{4, 1, 0, 1, 7};
//        ints[4] = new int[]{1, 0, 3, 0, 5};

        int[][] ints = new int[0][0];
//        ints[0] = new int[]{-4,-5};


        NumMatrix numMatrix = new NumMatrix(ints);
//        System.out.println(numMatrix.sumRegion(0,0,0,1));
    }

}
class NumMatrix {
    int[][] sumMatrix;
    public NumMatrix(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) return;
        sumMatrix = new int[matrix.length][matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int i1 = 0; i1 < matrix[0].length; i1++) {
             if(i1> 0){
                 sumMatrix[i][i1] = sumMatrix[i][i1-1] + matrix[i][i1];
             }else {
                 sumMatrix[i][i1] = matrix[i][i1];
             }
            }
        }
    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            if(col1 == 0){
                sum = sum + sumMatrix[i][col2];
            }else {
                sum = sum + (sumMatrix[i][col2] - sumMatrix[i][col1-1]);
            }
        }
        return sum;
    }
}