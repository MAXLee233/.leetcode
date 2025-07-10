/*
 * @lc app=leetcode.cn id=2099 lang=java
 *
 * [2099] 找到和最大的长度为 K 的子序列
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int[] maxSubsequence(int[] nums, int k) {
        int [] res=new int[k];
        // 二元数组分别存储原数组的值和索引
        int[][] arr = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            arr[i][0] =i;
            arr[i][1] = nums[i];
        }
        Arrays.sort(arr, (a, b) -> b[1] - a[1]); // 按值降序排序
        // 取前k个最大的值并按照索引排序
        Arrays.sort(arr, 0, k, (a, b) -> a[0] - b[0]);
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i][1]; // 取出值
        }
        return res;
    }
}
// @lc code=end

