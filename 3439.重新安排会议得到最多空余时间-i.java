/*
 * @lc app=leetcode.cn id=3439 lang=java
 *
 * [3439] 重新安排会议得到最多空余时间 I
 */

// @lc code=start
class Solution {
    public int maxFreeTime(int eventTime, int k, int[] startTime, int[] endTime) {
        int n = startTime.length;
        int[] freeTime = new int[n + 1];
        for (int i = 0; i < n; i++) {
            freeTime[i + 1] = freeTime[i] + (endTime[i] - startTime[i]);
        }
        int maxFreeTime = 0;
        for (int i = 0; i <= n; i++) { 
            int currentFreeTime = freeTime[i] + (eventTime - (i == 0 ? 0 : endTime[i - 1]));
            if (i < n) {
                currentFreeTime += (startTime[i] - (i == 0 ? 0 : endTime[i - 1]));
            }
            maxFreeTime = Math.max(maxFreeTime, currentFreeTime);
        }
        return  maxFreeTime;
    }
}
// @lc code=end

