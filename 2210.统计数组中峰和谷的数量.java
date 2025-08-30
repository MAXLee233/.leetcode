/*
 * @lc app=leetcode.cn id=2210 lang=java
 *
 * [2210] 统计数组中峰和谷的数量
 */

// @lc code=start
class Solution {
    public int countHillValley(int[] nums) {
        int res= 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int left = i - 1, right = i + 1;
            while (left >= 0 && nums[left] == nums[i]) left--;
            while (right < nums.length && nums[right] == nums[i]) right++;
            if (left >= 0 && right < nums.length) {
                if (nums[left] < nums[i] && nums[right] < nums[i]) {
                    res++;
                } else if (nums[left] > nums[i] && nums[right] > nums[i]) {
                    res++;
                }
            }
            i = right - 1; // 跳过重复元素，避免重复统计
        }
        return res;
    }
}
// @lc code=end

