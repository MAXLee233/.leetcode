/*
 * @lc app=leetcode.cn id=1353 lang=java
 *
 * [1353] 最多可以参加的会议数目
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int maxEvents(int[][] events) {
        int res=0;
        // 按照开始时间排序
        Arrays.sort(events, (a, b) -> a[0] - b[0]);
        while (events.length > 0) {
            // 取出第一个会议
            int[] firstEvent = events[0];
            // 结束时间
            int endTime = firstEvent[1];
            // 计数器
            res++;
            // 删除所有在这个会议结束时间之前的会议
            events = Arrays.stream(events)
                .filter(event -> event[0] > endTime)
                .toArray(int[][]::new);
        }
        return res;
    }
}
// @lc code=end

