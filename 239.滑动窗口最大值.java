/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int [] res = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque(); // 双端队列，用于存储当前窗口的最大值的下标
        for (int i = 0; i < n; i++) {
            // 如果队列不为空且当前元素大于等于队列尾部元素，则移除队列尾部元素
            while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]) {
                deque.pollLast();
            }
            deque.offerLast(i); // 将当前元素的下标添加到队列中
            
            // 如果队列的头部元素已经不在当前窗口内，则移除它
            if (deque.peekFirst() == i - k) {
                deque.pollFirst();
            }
            
            // 当窗口大小达到 k 时，将当前窗口的最大值存入结果数组
            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return res;
    }
}
// @lc code=end

