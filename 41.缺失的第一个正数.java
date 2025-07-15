/*
 * @lc app=leetcode.cn id=41 lang=java
 *
 * [41] 缺失的第一个正数
 */

// @lc code=start

import java.util.HashSet;

class Solution {
    public int firstMissingPositive(int[] nums) {
        int res= 1;
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (num > 0) {
                set.add(num);
            }
        }
        while (set.contains(res)) {
            res++;
        }
        return res;
    }
}
// @lc code=end

