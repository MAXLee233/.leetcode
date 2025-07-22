/*
 * @lc app=leetcode.cn id=1695 lang=java
 *
 * [1695] 删除子数组的最大得分
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int res=0, sum=0;
        boolean [] set = new boolean[10001];
        int left = 0;
        for (int  num : nums) {
            // 如果当前数字已经存在于子数组中，
            //则需要从左边开始删除元素，直到该数字不在子数组中
            while (set[num]) {
                set[nums[left]] = false;
                sum -= nums[left];
                left++;
            }
            set[num] = true;
            sum += num;
            res = Math.max(res, sum);
        }
        return res;
    }
}
// @lc code=end

