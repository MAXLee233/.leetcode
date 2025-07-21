/*
 * @lc app=leetcode.cn id=2163 lang=java
 *
 * [2163] 删除元素后和的最小差值
 */

// @lc code=start

import java.util.PriorityQueue;

class Solution {
    public long minimumDifference(int[] nums) {
        int n= nums.length/3;
        long[] left = new long[n + 1];
        long[] right = new long[n + 1];
        long sum = 0;
        PriorityQueue<Integer> lefQueue = new PriorityQueue<>((a, b) -> b - a);
        PriorityQueue<Integer> rightQueue = new PriorityQueue<>((a, b) -> a - b);
        for (int i = 0; i < n; i++) {
            lefQueue.offer(nums[i]);
            sum += nums[i];
        }
        for (int i = n; i < nums.length; i++) {
            rightQueue.offer(nums[i]);
            sum += nums[i];
        }
    }
}
// @lc code=end

