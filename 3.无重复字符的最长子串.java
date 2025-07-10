/*
 * @lc app=leetcode.cn id=3 lang=java
 *
 * [3] 无重复字符的最长子串
 */

// @lc code=start

import java.util.*;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) return 0; 
        if (s.length() == 1) return 1;
        int res = 1;
        int left = 0;
        Set<Character> set = new HashSet<>();
        set.add(s.charAt(0)); 
        for (int i = 1; i < s.length(); i++) {
            if (set.contains(s.charAt(i))) {
                  while (left < i && set.contains(s.charAt(i))) {
                    set.remove(s.charAt(left));
                    left++;   
                  }
            }
            set.add(s.charAt(i));
            res = Math.max(res, i - left + 1);
        }
        return res;
    }
}
// @lc code=end

