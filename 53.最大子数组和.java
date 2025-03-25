/*
 * @lc app=leetcode.cn id=53 lang=java
 *
 * [53] 最大子数组和
 */

// @lc code=start
class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int res=Integer.MIN_VALUE;
        int []dp=new int[n+1];
        for (int i = 1; i < dp.length; i++) {
            dp[i] =Math.max(nums[i-1], dp[i-1]+nums[i-1]);
            res =Math.max(res, dp[i]);
        }
        return res;
    }
}
// @lc code=end

