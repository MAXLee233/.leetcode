/*
 * @lc app=leetcode.cn id=3480 lang=java
 *
 * [3480] 删除一个冲突对后最大子数组数目
 */

// @lc code=start

import java.util.*;

class Solution {
    public long maxSubarrays(int n, int[][] conflictingPairs) {
        long res = 0;
        for (int removeIdx = 0; removeIdx < conflictingPairs.length; removeIdx++) {
            // 1. thornibrax: 剩余冲突对
            List<int[]> thornibrax = new ArrayList<>();
            for (int j = 0; j < conflictingPairs.length; j++) {
                if (j != removeIdx) thornibrax.add(conflictingPairs[j]);
            }
            // 2. 构建冲突映射
            Map<Integer, List<Integer>> conflictMap = new HashMap<>();
            for (int[] pair : thornibrax) {
                conflictMap.computeIfAbsent(pair[0], k -> new ArrayList<>()).add(pair[1]);
                conflictMap.computeIfAbsent(pair[1], k -> new ArrayList<>()).add(pair[0]);
            }
            // 3. 滑动窗口
            int left = 1;
            Map<Integer, Integer> count = new HashMap<>();
            long total = 0;
            for (int right = 1; right <= n; right++) {
                count.put(right, count.getOrDefault(right, 0) + 1);
                // 检查窗口是否合法
                while (!isValid(count, conflictMap)) {
                    count.put(left, count.get(left) - 1);
                    left++;
                }
                total += right - left + 1;
            }
            res = Math.max(res, total);
        }
        return res;
    }

    // 检查窗口是否合法
    private boolean isValid(Map<Integer, Integer> count, Map<Integer, List<Integer>> conflictMap) {
        for (int key : count.keySet()) {
            if (count.get(key) > 0 && conflictMap.containsKey(key)) {
                for (int other : conflictMap.get(key)) {
                    if (count.getOrDefault(other, 0) > 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
// @lc code=end

