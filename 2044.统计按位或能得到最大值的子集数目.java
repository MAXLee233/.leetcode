/*
 * @lc app=leetcode.cn id=2044 lang=java
 *
 * [2044] 统计按位或能得到最大值的子集数目
 */

// @lc code=start
class Solution {
    public int countMaxOrSubsets(int[] nums) {
        int maxOr = 0;
        int count = 0;
        int n = nums.length;
        // 计算所有子集的按位或
        for (int i = 0; i < (1 << n); i++) {
            int currentOr = 0;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    currentOr |= nums[j];
                }
            }
            // 更新最大按位或值和计数
            if (currentOr > maxOr) {
                maxOr = currentOr;
                count = 1;
            } else if (currentOr == maxOr) {
                count++;
            }
        }
    }
}
// @lc code=end

