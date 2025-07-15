/*
 * @lc app=leetcode.cn id=73 lang=java
 *
 * [73] 矩阵置零
 */

// @lc code=start
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean []rowZero = new boolean[matrix.length];
        boolean []colZero = new boolean[matrix[0].length];
        for (int i = 0; i < rowZero.length; i++) {
            for (int  j = 0; j< colZero.length; j++) {
                if (matrix[i][j] == 0) {
                    rowZero[i] = true;
                    colZero[j] = true;    
                }
            }
        }
        for (int i = 0; i < rowZero.length; i++) {
            for (int j = 0; j < colZero.length; j++) {
                if (rowZero[i] || colZero[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
// @lc code=end

