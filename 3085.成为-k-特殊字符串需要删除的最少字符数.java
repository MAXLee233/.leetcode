/*
 * @lc app=leetcode.cn id=3085 lang=java
 *
 * [3085] 成为 K 特殊字符串需要删除的最少字符数
 */

// @lc code=start

import java.util.Arrays;

class Solution {
    public int minimumDeletions(String word, int k) {
        int[] cnt = new int[26];
        for (char c : word.toCharArray()) {
            cnt[c - 'a']++;
        }
        Arrays.sort(cnt);
        int ans = Integer.MAX_VALUE;
		//枚举其中一种作为「删除操作结束后出现频率最低的字符」，
		//将其设置为 c，那么所有频率小于 c 的字符都会被删除，
		//所有频率大于 cnt[c]+k 的字符都会被删除至只剩下 cnt[c] 个。
        for (int i : cnt) {
			if (i == 0) {
				continue;	
			}
			int maxLimit = i + k;
			int sum = 0;
			for (int j : cnt) {
				if (j > maxLimit) {
					sum += j - maxLimit;
				}
				if (j < i) {
					sum += j;
				}
			}
			ans = Math.min(ans, sum);
		}

        return ans;
    }
}
// @lc code=end

