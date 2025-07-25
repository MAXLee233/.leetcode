/*
 * @lc app=leetcode.cn id=136 lang=java
 *
 * [136] 只出现一次的数字
 */

// @lc code=start
class Solution {
    public int singleNumber(int[] nums) {
        int res=0;
        for (int num : nums) {
            res ^= num; // 异或操作
        }
        return res; // 返回只出现一次的数字
    }
} 
// @lc code=end

