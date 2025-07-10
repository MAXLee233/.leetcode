/*
 * @lc app=leetcode.cn id=42 lang=java
 *
 * [42] 接雨水
 */

// @lc code=start
class Solution {
    public int trap(int[] height) {
        int res = 0;
        int n = height.length;
        int [] left= new int[n];
        int [] right = new int[n];
        left[0] = height[0];
        for (int i = 1; i < right.length; i++) {
            left[i] =Math.max(left[i - 1], height[i-1]);
        }
        right[n - 1] = height[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], height[i + 1]);
        }
        for (int i = 0; i < n; i++) {
            int min = Math.min(left[i], right[i]);
            if (min > height[i]) {
                res += min - height[i];
            }
        }
        return res;
    }
}
// @lc code=end

