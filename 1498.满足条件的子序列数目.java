/*
 * @lc app=leetcode.cn id=1498 lang=java
 *
 * [1498] 满足条件的子序列数目
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int numSubseq(int[] nums, int target) {
        int mod = 1000000007;
        int n = nums.length;
        int res= 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            int right = n - 1;
            
            while (right >= i && nums[i] + nums[right] > target) {
                    right--;
            } 
            if (right>=i) {
                res += Math.pow(2, right - i);
                res %= mod; 
            }
        }
        return res%mod;
    }
}
// @lc code=end

