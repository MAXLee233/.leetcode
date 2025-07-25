/*
 * @lc app=leetcode.cn id=48 lang=java
 *
 * [48] 旋转图像
 */

// @lc code=start
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int [][] tmp= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                tmp[j][n-1-i]=matrix[i][j];
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=tmp[i][j];
            }
        }
    }
}
// @lc code=end

