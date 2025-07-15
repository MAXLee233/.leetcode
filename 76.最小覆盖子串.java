/*
 * @lc app=leetcode.cn id=76 lang=java
 *
 * [76] 最小覆盖子串
 */

// @lc code=start

import java.util.HashMap;

class Solution {
    public String minWindow(String s, String t) {
        StringBuilder sb= new StringBuilder();
        int m=s.length(), n=t.length();
        HashMap<Character, Integer> need = new HashMap<>();
        HashMap<Character, Integer> window = new HashMap<>();
        for (char c : t.toCharArray()) {
            need.put(c, need.getOrDefault(c, 0) + 1);
        }
        for (char c : s.toCharArray()) {
            if (need.containsKey(c)) {
                window.put(c, window.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : need.keySet()) {
            if (!window.containsKey(c) || window.get(c) < need.get(c)) {
                return "";
            }    
        }
        int left= 0,right=m-1;
        while (left < m && right >= 0) {
            char c = s.charAt(left);
            if (need.containsKey(c)) {
                window.put(c, window.get(c) - 1);
                if (window.get(c) < need.get(c)) {
                    left++;
                    continue;
                }
            }
            while (right >= left && window.get(s.charAt(right)) > need.getOrDefault(s.charAt(right), 0)) {
                right--;
            }
            if (right - left + 1 < sb.length() || sb.length() == 0) {
                sb.setLength(0);
                sb.append(s.substring(left, right + 1));
            }
            left++;    
        }
        return sb.toString();
    }
}
// @lc code=end

