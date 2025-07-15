/*
 * @lc app=leetcode.cn id=189 lang=java
 *
 * [189] 轮转数组
 */

// @lc code=start
class Solution {
    public void rotate(int[] nums, int k) {
        k= k % nums.length; // 处理k大于数组长度的情况
        int [] temp = new int[nums.length];
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            temp[i] = nums[n-k+i];
        }
        for (int i = n - 1; i >= k; i--) {
            nums[i] = nums[i - k];
        }
        for (int i = 0; i < k; i++) {
            nums[i] = temp[i];
        }
    }
}
// @lc code=end

