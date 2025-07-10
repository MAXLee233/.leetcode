/*
 * @lc app=leetcode.cn id=438 lang=java
 *
 * [438] 找到字符串中所有字母异位词
 */

// @lc code=start

import java.util.Arrays;
import java.util.List;

class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new java.util.ArrayList<>();
        int [] pCount = new int[26];
        for (char i : p.toCharArray()) {
            pCount[i-'a'] ++;
        }
        int np= p.length();
        int[] sCount = new int[26];
        for (int l = 0,r=0; l < s.length(); l++) {
            if (l>0) {
                sCount[s.charAt(l-1)-'a']--;
            }
            while (r < s.length() && r-l < np) {
                sCount[s.charAt(r)-'a']++;
                r++;
            }
            if (r-l == np && Arrays.equals(sCount, pCount)) {
                res.add(l);
            }
        }     
        return res;
    }
}
// @lc code=end

