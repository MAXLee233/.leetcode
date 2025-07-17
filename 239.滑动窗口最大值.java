/*
 * @lc app=leetcode.cn id=239 lang=java
 *
 * [239] 滑动窗口最大值
 */

// @lc code=start

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.PriorityQueue;

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n=nums.length;
        int [] res = new int[n - k + 1];
        PriorityQueue<int[]> pq = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] != o2[0] ? o2[0] - o1[0] : o2[1] - o1[1];
                // o1[0]是值，o1[1]是索引
                //如果值不相等，按值降序排列,
                //如果值相等，按索引降序排列
            }
        });
        for (int i = 0; i < k; i++) {
            pq.offer(new int[]{nums[i], i});
        }
        //把前k个元素放入优先队列中
        res[0] = pq.peek()[0];
        for(int i=k; i<n; i++) {
            pq.offer(new int[]{nums[i], i});
            //如果队首元素的索引小于等于i-k，说明它已经不在窗口内了，需要弹出
            while (pq.peek()[1] <= i - k) {
                pq.poll();
            }
            //弹出当前窗口内的最大值
            res[i - k + 1] = pq.peek()[0];
        }
        return res;
    }
}
// @lc code=end

