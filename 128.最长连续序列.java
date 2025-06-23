/*
 * @lc app=leetcode.cn id=128 lang=java
 *
 * [128] 最长连续序列
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int longestConsecutive(int[] nums) {
        Arrays.sort(nums);
        int maxLength = 0;
        for (int i = 0; i < nums.length; i++) {
            int currentLength = 1;
            if (i > 0 && nums[i] == nums[i - 1]) {
                // 跳过重复的数字
                continue;  
            }else{
                while (i + 1 < nums.length && nums[i + 1] == nums[i] + 1) {
                    currentLength++;
                    i++;
                }
            }          
            maxLength = Math.max(maxLength, currentLength);
        }
        return maxLength;
    }
}
// @lc code=end

