/*
 * @lc app=leetcode.cn id=56 lang=java
 *
 * [56] 合并区间
 */

// @lc code=start

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> res = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] current = new int[2];
        current[0] = intervals[0][0];
        current[1] = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (current[1] >= intervals[i][0]) {
                // 有交集
                current[1] = Math.max(current[1], intervals[i][1]);
            } else {
                // 无交集
                res.add(current);
                current = new int[2];
                current[0] = intervals[i][0];
                current[1] = intervals[i][1];     
            }
        }
        // 最后一个区间
        res.add(current);
        return res.toArray(new int[res.size()][]);
    }
}
// @lc code=end

