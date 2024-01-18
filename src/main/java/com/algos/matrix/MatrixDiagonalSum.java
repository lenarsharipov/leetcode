package com.algos.matrix;

/**
 * Time Complexity
 * O(n): We traverse through each row of the matrix exactly once to get the elements
 * for our diagonal sums, where ( n ) is the number of rows (or columns, since
 * it's a square matrix). We do constant time work for each element (just addition and assignment). *
 *
 * Hence, the overall time complexity of the algorithm is ( O(n) ).
 *
 * Space Complexity
 * O(1): The space complexity is constant because we are using a fixed amount of additional space.
 * Our algorithm only uses two integer variables (length and totalSum) besides the input,
 * which doesn’t grow with the size of the input matrix. Therefore, the amount of extra space
 * utilized doesn't scale with the size of the input.
 *
 * So, the overall space complexity of the algorithm is ( O(1) ).
 */
public class MatrixDiagonalSum {
    public static int diagonalSum(int[][] mat) {
        if (mat == null) {
            return 0;
        }
        int totalSum = 0;
        int length = mat.length;
        for (int index = 0; index < length; index++) {
            totalSum += mat[index][index] + mat[index][length - index - 1];
        }
        if (length % 2 != 0) {
            totalSum -= mat[length / 2][length / 2];
        }
        return totalSum;  // Return the calculated total sum
    }
}
