/*
 * @lc app=leetcode.cn id=2272 lang=java
 *
 * [2272] 最大波动的子字符串
 */

// @lc code=start
class Solution {
    public int largestVariance(String s) {
        int res = 0;
        int n = s.length();

        // 遍历所有可能的字符对 (c1, c2)
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == j) {
                    continue;
                }
                char c1 = (char) ('a' + i);
                char c2 = (char) ('a' + j);

                // Kadane's algorithm variables
                int currentVariance = 0;
                boolean hasC2 = false; // 是否包含至少一个 c2
                int firstC2Seen = 0; // 记录第一个 c2 出现后的波动值

                for (int k = 0; k < n; k++) {
                    char ch = s.charAt(k);

                    if (ch == c1) {
                        currentVariance++;
                    } else if (ch == c2) {
                        hasC2 = true;
                        currentVariance--;
                        // 记录第一个 c2 出现后的波动值
                        firstC2Seen = Math.max(firstC2Seen, currentVariance);
                    }

                    // 更新结果
                    if (hasC2) {
                        res = Math.max(res, currentVariance);
                    }

                    // 如果波动值变为负数，允许重新开始计算
                    if (currentVariance < 0) {
                        currentVariance = 0;
                        hasC2 = false; // 重置时需要重新包含至少一个 c2
                    }
                }

                // 如果只出现了 c1，没有 c2，尝试用 firstC2Seen 更新结果
                res = Math.max(res, firstC2Seen);
            }
        }

        return res;
    }
}
// @lc code=end

